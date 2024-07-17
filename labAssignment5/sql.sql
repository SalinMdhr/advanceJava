CREATE DATABASE NCCS;
CREATE TABLE users (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	username VARCHAR(50),
	upassword VARCHAR(50)
);
CREATE TABLE students (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	fname VARCHAR(50),
	address VARCHAR(50),
	gender VARCHAR(50),
	DOB DATE,
	program VARCHAR(50),
	contact VARCHAR(50) UNIQUE,
	email VARCHAR(50)
);

INSERT INTO users (username, upassword) VALUES
("Ram", "1234");


//Qno2
CREATE DATABASE pasal;
CREATE TABLE products (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(50),
	price DOUBLE,
	quantity INT
);

//Qno3
CREATE DATABASE china_company;
CREATE TABLE employees (
	id INT NOT NULL PRIMARY KEY,
	name VARCHAR(50),
	position VARCHAR(50),
	salary DOUBLE
);