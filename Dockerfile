# Stage 1: Build the JAR
FROM eclipse-temurin:17-jdk-jammy as builder
WORKDIR /app
COPY . .
RUN ./gradlew bootJar

# Stage 2: Run the application
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

# Copy the built JAR from builder stage
COPY --from=builder /app/build/libs/my-test-docker-image.jar my-test-docker-image.jar

# Optional: Add timezone support
RUN apt-get update && apt-get install -y tzdata

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "my-test-docker-image.jar"]