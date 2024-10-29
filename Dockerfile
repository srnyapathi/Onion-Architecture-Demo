# Use an OpenJDK 21 base image
FROM eclipse-temurin:21-jre

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
# Assuming the JAR is in 'target' and named 'myapp.jar'
COPY ./application/target/onion-architecture-demo.jar /app/onion-architecture-demo.jar

# Expose the port your application runs on (update as needed)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "/app/onion-architecture-demo.jar"]

