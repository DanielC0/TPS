

CREATE TABLE dealing (
	id	INTEGER PRIMARY KEY AUTOINCREMENT,
	product	INTEGER,
	quantity 	DOUBLE,
	unit_price 	DOUBLE,
	movement 	INTEGER,
	FOREIGN KEY( product ) REFERENCES  Product ( id ) ON DELETE SET NULL,
	FOREIGN KEY( movement ) REFERENCES  Movement ( id ) ON DELETE SET NULL
);

CREATE TABLE product  (
	 id 	INTEGER PRIMARY KEY AUTOINCREMENT,
	 name 	STRING ( 1 , 50 ),
	 stock 	DOUBLE,
	 description 	STRING ( 1 , 50 ),
	 cpp 	DOUBLE,
	 price 	DOUBLE,
	 category 	INTEGER,
	FOREIGN KEY( category ) REFERENCES  Category ( id ) ON DELETE SET NULL
);

CREATE TABLE payment  (
	 id 	INTEGER PRIMARY KEY AUTOINCREMENT,
	 credit 	INTEGER,
	 moment 	DATETIME,
	 price 	DOUBLE,
	FOREIGN KEY( credit ) REFERENCES  Credit ( id )
);

CREATE TABLE passwrd  (
	 wordkwy 	STRING
);


CREATE TABLE movement  (
	 id 	INTEGER PRIMARY KEY AUTOINCREMENT,
	 kind 	STRING,
	 price_total 	DOUBLE,
	 moment 	DATETIME
);

CREATE TABLE external_payment  (
	 id 	INTEGER PRIMARY KEY AUTOINCREMENT,
	 description 	STRING,
	 price_total 	DOUBLE,
	 movement 	INTEGER,
	FOREIGN KEY( movement ) REFERENCES  Movement ( id ) ON DELETE SET NULL
);

CREATE TABLE credit  (
	 id 	INTEGER PRIMARY KEY AUTOINCREMENT,
	 client 	INTEGER,
	 movement 	INTEGER,
	FOREIGN KEY( client ) REFERENCES  Client ( cc ),
	FOREIGN KEY( movement ) REFERENCES  Movement ( id ) ON DELETE SET NULL
);

CREATE TABLE client  (
	 cc 	INTEGER,
	 name 	STRING ( 1 , 50 ),
	 phone 	INTEGER,
	 address 	STRING,
	PRIMARY KEY( cc )
);

CREATE TABLE category  (
	 id 	INTEGER PRIMARY KEY AUTOINCREMENT,
	 name 	STRING ( 1 , 50 ),
	 description 	STRING ( 1 , 50 )
);

