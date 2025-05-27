FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copy file jar hasil build
COPY target/backend-simple-1.0.0.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
