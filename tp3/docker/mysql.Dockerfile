FROM debian:stable-slim
RUN apt-get update && apt-get install -y default-mysql-server && rm -rf /var/lib/apt/lists/*
COPY init.sql /docker-entrypoint-initdb.d/init.sql
EXPOSE 3306
CMD ["bash","-lc","mysqld_safe"]