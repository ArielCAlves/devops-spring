#!/bin/bash
docker tag catalog_service:latest yourrepo/catalog_service:latest
docker tag order_service:latest yourrepo/order_service:latest
docker tag database_service:latest yourrepo/database_service:latest

docker push yourrepo/catalog_service:latest
docker push yourrepo/order_service:latest
docker push yourrepo/database_service:latest