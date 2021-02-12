BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS `Transaction` (
	`id`	INTEGER PRIMARY KEY AUTOINCREMENT,
	`product`	INTEGER,
	`quantity`	DOUBLE,
	`unit_price`	DOUBLE,
	`movement`	INTEGER,
	FOREIGN KEY(`movement`) REFERENCES `Movement`(`id`) ON DELETE SET NULL,
	FOREIGN KEY(`product`) REFERENCES `Product`(`id`) ON DELETE SET NULL
);
CREATE TABLE IF NOT EXISTS `Product` (
	`id`	INTEGER PRIMARY KEY AUTOINCREMENT,
	`name`	STRING ( 1 , 50 ),
	`stock`	DOUBLE,
	`description`	STRING ( 1 , 50 ),
	`cpp`	DOUBLE,
	`price`	DOUBLE,
	`category`	INTEGER,
	FOREIGN KEY(`category`) REFERENCES `Category`(`id`) ON DELETE SET NULL
);
CREATE TABLE IF NOT EXISTS `Payment` (
	`id`	INTEGER PRIMARY KEY AUTOINCREMENT,
	`credit`	INTEGER,
	`moment`	DATE,
	`price`	DOUBLE,
	FOREIGN KEY(`credit`) REFERENCES `Credit`(`id`)
);
CREATE TABLE IF NOT EXISTS `Passwrd` (
	`wordkwy`	STRING
);
CREATE TABLE IF NOT EXISTS `Movement` (
	`id`	INTEGER PRIMARY KEY AUTOINCREMENT,
	`kind`	STRING,
	`price_total`	DOUBLE,
	`moment`	DATE
);
CREATE TABLE IF NOT EXISTS `External_payment` (
	`id`	INTEGER PRIMARY KEY AUTOINCREMENT,
	`description`	STRING,
	`price_total`	DOUBLE,
	`movement`	INTEGER,
	FOREIGN KEY(`movement`) REFERENCES `Movement`(`id`) ON DELETE SET NULL
);
CREATE TABLE IF NOT EXISTS `Credit` (
	`id`	INTEGER PRIMARY KEY AUTOINCREMENT,
	`client`	INTEGER,
	`movement`	INTEGER,
	FOREIGN KEY(`movement`) REFERENCES `Movement`(`id`) ON DELETE SET NULL,
	FOREIGN KEY(`client`) REFERENCES `Client`(`cc`)
);
CREATE TABLE IF NOT EXISTS `Client` (
	`cc`	INTEGER,
	`name`	STRING ( 1 , 50 ),
	`phone`	INTEGER,
	`address`	STRING,
	PRIMARY KEY(`cc`)
);
CREATE TABLE IF NOT EXISTS `Category` (
	`id`	INTEGER PRIMARY KEY AUTOINCREMENT,
	`name`	STRING ( 1 , 50 ),
	`description`	STRING ( 1 , 50 )
);
COMMIT;
