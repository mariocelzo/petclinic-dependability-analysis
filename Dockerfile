# Multi-stage Dockerfile for Spring PetClinic
# Optimized for production deployment

# ============================================
# Stage 1: Build
# ============================================
FROM maven:3.9-eclipse-temurin-21 AS build

LABEL maintainer="your-email@example.com"
LABEL description="Spring PetClinic - Dependability Analysis Project"

# Set working directory
WORKDIR /app

# Copy Maven files first for better caching
COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn

# Download dependencies (cached layer)
RUN ./mvnw dependency:go-offline -B

# Copy source code
COPY src ./src

# Build application
RUN ./mvnw clean package -DskipTests -B

# ============================================
# Stage 2: Runtime
# ============================================
FROM eclipse-temurin:21-jre-alpine

# Install required packages
RUN apk add --no-cache \
    curl \
    bash

# Create app user (security best practice)
RUN addgroup -S spring && adduser -S spring -G spring

# Set working directory
WORKDIR /app

# Copy JAR from build stage
COPY --from=build /app/target/*.jar app.jar

# Change ownership
RUN chown -R spring:spring /app

# Switch to non-root user
USER spring:spring

# Expose port
EXPOSE 8080

# Health check
HEALTHCHECK --interval=30s --timeout=3s --start-period=40s --retries=3 \
    CMD curl -f http://localhost:8080/actuator/health || exit 1

# Environment variables
ENV JAVA_OPTS="-Xms256m -Xmx512m" \
    SPRING_PROFILES_ACTIVE="production"

# Run application
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]

# ============================================
# Build Instructions:
# ============================================
# docker build -t petclinic-dependability:latest .
# docker run -p 8080:8080 petclinic-dependability:latest
#
# With custom memory:
# docker run -p 8080:8080 -e JAVA_OPTS="-Xms512m -Xmx1024m" petclinic-dependability:latest
# ============================================
