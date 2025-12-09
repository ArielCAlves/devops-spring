#!/bin/bash
kubectl apply -f k8s/catalog-deployment.yaml
kubectl apply -f k8s/catalog-service.yaml

kubectl apply -f k8s/order-deployment.yaml
kubectl apply -f k8s/order-service.yaml

kubectl apply -f k8s/database-deployment.yaml
kubectl apply -f k8s/database-service.yaml