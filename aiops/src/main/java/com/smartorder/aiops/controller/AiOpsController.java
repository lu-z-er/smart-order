package com.smartorder.aiops.controller;

import com.smartorder.aiops.AnomalyDetector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/ai-ops")
public class AiOpsController {

    @Autowired
    private AnomalyDetector anomalyDetector;

    @PostMapping("/check")
    public String checkMetrics(@RequestBody Map<String, double[]> request) {
        double[] metrics = request.getOrDefault("metrics", new double[]{});

        if (metrics.length == 0) {
            return "No metrics provided.";
        }

        boolean anomaly = anomalyDetector.isAnomaly(metrics);
        return anomaly ? "Anomaly detected! Suggest scaling up." : "System is operating normally.";
    }
}
