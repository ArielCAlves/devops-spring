FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY order_service/target/order_service.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","app.jar"]