# Use official openjdk image as a base image
FROM openjdk:21-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file from the target folder into the container
COPY target/gateway-0.0.1-SNAPSHOT.jar gateway.jar

# Expose the port that the application runs on
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "gateway.jar"]
