#!/bin/bash

minikube start

echo "Buildando as imagens..."
minikube image build -t catalog:latest -f docker/catalog.Dockerfile .
minikube image build -t order:latest -f docker/order.Dockerfile .
minikube image build -t mysql-custom:1.0 -f docker/mysql.Dockerfile docker

echo "Applies do k8s..."
kubectl apply -f k8s/mysql-deployment.yaml
kubectl apply -f k8s/mysql-service.yaml
kubectl apply -f k8s/catalog-deployment.yaml
kubectl apply -f k8s/catalog-service.yaml
kubectl apply -f k8s/order-deployment.yaml
kubectl apply -f k8s/order-service.yaml

echo "Foi!"