
FROM maven:3.9-eclipse-temurin-17 AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package

FROM eclipse-temurin:17-jre

WORKDIR /app

COPY --from=build /app/target/even-odd-ci-0.0.1-SNAPSHOT.jar even-odd.jar

ENTRYPOINT ["java", "-jar", "/app/even-odd.jar"]
