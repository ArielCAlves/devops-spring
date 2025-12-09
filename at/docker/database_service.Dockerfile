FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY database_service/target/database_service.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]