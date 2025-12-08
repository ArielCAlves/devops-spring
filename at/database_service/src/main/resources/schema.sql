CREATE TABLE IF NOT EXISTS database_entity (
       id BIGINT AUTO_INCREMENT PRIMARY KEY,
       info VARCHAR(255)
    );

INSERT INTO database_entity(info) VALUES ('db ok');