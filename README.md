## Microsserviços do Projeto [AT](https://github.com/ArielCAlves/devops-spring/tree/main/at)
### 1. Requisitos
- Java 17
- Maven
- Docker instalado e em execução
- Kubernetes (Minikube ou Docker Desktop com Kubernetes ativado)
- Git instalado

---

### 2. Estrutura do Projeto

```
at
├── catalog_service
├── order_service
├── database_service
│
├── docker
│   ├── docker-compose.yml
│   ├── catalog-service.Dockerfile
│   ├── order-service.Dockerfile
│   └── database-service.Dockerfile
│
├── k8s
│   ├── catalog-deployment.yaml
│   ├── catalog-service.yaml
│   ├── order-deployment.yaml
│   ├── order-service.yaml
│   ├── database-deployment.yaml
│   └── database-service.yaml
│
└── shell
    ├── build_all.sh
    ├── run_all.sh
    └── deploy_k8s.sh
```
---

### 3. Funcionalidade dos Microsserviços
#### 3.1.  catalog_service

Disponibiliza produtos via endpoints REST.
Porta padrão: 8081

Endpoints:
- GET /products
- GET /products/{id}

#### 3.2. order_service

Consome o catalog_service usando WebClient.
Porta padrão: 8082

Endpoints:
- GET /order/{id}

#### 3.4. database_service

Serviço isolado para gerenciar banco de dados.
Porta padrão: 8083

---

### 4. Como Executar Usando Docker
#### 4.1 Construir as imagens

A partir da pasta “at”:

`sh shell/build.sh`

#### 4.2 Rodar os serviços com Docker Compose

`docker compose -f docker/docker-compose.yml`

#### 4.3 Acesse:
**Catalog** → http://localhost:8081/products

**Order** → http://localhost:8082/order/1

**Database** → http://localhost:8083/dbtest

---

### 5. Como Executar Usando Kubernetes
#### 5.1 Iniciar o Minikube

`minikube start`

#### 5.2 Aplicar deploys e services


`sh shell/deploy.sh`

- minikube service catalog-service
- minikube service order-service
- minikube service database-service
