FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY catalog_service/target/catalog_service.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","app.jar"]