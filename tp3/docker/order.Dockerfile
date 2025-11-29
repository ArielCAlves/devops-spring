FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY ../tp3_order_service/pom.xml .
RUN mvn dependency:go-offline -q
COPY ../tp3_order_service/src ./src
RUN mvn package -DskipTests -q

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","app.jar"]