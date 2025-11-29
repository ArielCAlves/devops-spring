CREATE TABLE IF NOT EXISTS product (
       id BIGINT AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(255),
       price DOUBLE
    );

INSERT INTO product(name, price) VALUES ('Mouse', 800.0);
INSERT INTO product(name, price) VALUES ('Teclado', 1200.0);
