FROM ubuntu:22.04

RUN apt-get update && apt-get install -y mysql-server && rm -rf /var/lib/apt/lists/*

ENV MYSQL_ROOT_PASSWORD=root

COPY init.sql /init.sql
COPY entrypoint.sh /entrypoint.sh
RUN chmod +x /entrypoint.sh

EXPOSE 3306
CMD ["/entrypoint.sh"]