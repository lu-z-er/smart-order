package com.smartorder.order.controller;

import com.smartorder.order.dto.OrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${order.validation.url}")
    private String validationUrl;

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @PostMapping
    public String placeOrder(@RequestBody OrderRequest request) {
        String validationResponse = restTemplate.postForObject(validationUrl, request, String.class);

        if (validationResponse != null && validationResponse.contains("valid")) {
            logger.info("Received request to create order with details: {}", request.getProductId());
            return "Order placed successfully after validation!";
        } else {
            return "Order validation failed: " + validationResponse;
        }
    }
}
