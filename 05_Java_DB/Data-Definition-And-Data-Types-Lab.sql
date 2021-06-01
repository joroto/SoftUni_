# Create a new database
CREATE DATABASE new_schema;

USE `new_schema`;

# Create tables
CREATE TABLE employees (
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(45),
    last_name VARCHAR(45)
);
CREATE TABLE categories (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(45) NOT NULL
);
CREATE TABLE products (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(45) NOT NULL,
    category_id INT,
    FOREIGN KEY (category_id)
        REFERENCES categories (id)
)
# Inserting data in tables
INSERT employees
VALUES ('25', 'pesho', 'peshev');

# Editing some data
UPDATE employees 
SET 
    first_name = 'ivan'
WHERE
    id = 25;

# Deleting data
DELETE FROM employees 
WHERE
    id = 25;

# Dropping table
DROP TABLE employees;

# Dropping the database
DROP DATABASE new_schema;