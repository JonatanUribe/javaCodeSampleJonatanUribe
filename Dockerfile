FROM java:8-jdk
WORKDIR /app
COPY pom.xml /app/pom.xml
COPY src /app/src
RUN mvn clean install