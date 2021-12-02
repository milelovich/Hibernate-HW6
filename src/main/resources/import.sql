DROP TABLE customers IF EXISTS;
CREATE TABLE IF NOT EXISTS customers (id bigserial, name VARCHAR(255), PRIMARY KEY (id));
INSERT INTO customers (name) VALUES ('Bob'), ('Jack');

DROP TABLE products IF EXISTS;
CREATE TABLE IF NOT EXISTS products (id bigserial, title VARCHAR(255), price int, PRIMARY KEY (id));
INSERT INTO products (title, price) VALUES ('Milk', 80), ('Beer', 30), ('Water', 10);
