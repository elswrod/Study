
/* Drop Tables */

DROP TABLE CAR;

create database Cars charset=utf8;

use Cars;
/* Create Tables */

CREATE TABLE CAR
(
	CARID VARCHAR(10) NOT NULL,
	BRAND VARCHAR(20),
	COLOR VARCHAR(20),
	PRICE DOUBLE,
	PRIMARY KEY (CARID)
);



