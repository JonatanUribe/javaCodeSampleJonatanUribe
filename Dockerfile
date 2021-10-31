FROM adoptopenjdk/maven-openjdk
WORKDIR /app
COPY pom.xml /app/pom.xml
COPY src /app/src
RUN mvn clean install