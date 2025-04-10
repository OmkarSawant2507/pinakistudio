# === Stage 1: Build the application ===
FROM maven:3.8.5-openjdk-17 AS build

WORKDIR /app

# Copy pom.xml and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy source files
COPY src ./src

# Package the app
RUN mvn clean package -DskipTests

# === Stage 2: Run the application ===
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy the jar from the build stage
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
