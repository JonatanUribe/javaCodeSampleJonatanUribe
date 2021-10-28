FROM openjdk:8-jdk-slim
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]