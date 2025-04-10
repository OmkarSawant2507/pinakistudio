FROM maven:3.8.5-openjdk-17 AS build

WORKDIR /app
COPY . .


WORKDIR /app/pinkai-backend


FROM openjdk:17.0.1-jdk-slim
COPY --from=build /app/pinkai-backend/target/pinkai-0.0.1-SNAPSHOT.jar pinkai.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "pinkai.jar"]
