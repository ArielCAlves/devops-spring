#!/bin/bash
cd ..
mvn -f catalog_service/pom.xml clean package -DskipTests
mvn -f order_service/pom.xml clean package -DskipTests
mvn -f database_service/pom.xml clean package -DskipTests

docker build -t catalog_service:latest -f docker/catalog_service.Dockerfile .
docker build -t order_service:latest -f docker/order_service.Dockerfile .
docker build -t database_service:latest -f docker/database_service.Dockerfile .