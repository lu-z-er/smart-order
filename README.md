
# SmartOrder - Microservices-based E-commerce Order Processing System

SmartOrder is a modern, scalable, and efficient microservices-based order processing system. The system utilizes **Spring Boot**, **Spring Cloud**, **Istio** service mesh, and **AI-driven operations** to provide a robust and adaptable platform for managing orders in an e-commerce environment. 

### Key Features

- **Service Mesh**: Integration with Istio for observability, traffic management, and security.
- **Serverless Order Validation**: Using Spring Cloud Function for scalable and serverless order validation.
- **AI-Driven Operations (AI Ops)**: Anomaly detection powered by machine learning (ML) to optimize resource usage and provide alerting mechanisms.

---

## Architecture Overview

The SmartOrder project is structured into several key services:

- **Order Service**: Manages order creation and processing.
- **Validation Service**: Validates orders using serverless functions. [https://github.com/lu-z-er/validation]
- **AI Ops Service**: Monitors system performance using machine learning and handles auto-scaling.
- **Gateway Service**: Exposes a single entry point for all requests, integrated with Istio for routing and load balancing.

---

## Prerequisites

Before setting up the project, ensure the following are installed:

- **Java 21** (or compatible)
- **Spring Boot 3.4.4**
- **Docker**
- **Kubernetes (using docker desktop)**
- **Istio** (Service Mesh)

---

