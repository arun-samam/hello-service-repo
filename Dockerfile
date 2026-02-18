FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app
COPY target/hello-service-1.0.jar /app/hello-service.jar
EXPOSE 4567
CMD ["java", "-jar", "hello-service.jar"]