CREATE TABLE passwrd  (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  wordkey STRING
  
);

CREATE TABLE category  (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  name STRING ( 1 , 50 ) NOT NULL,
  description STRING ( 1 , 50 )
  
);

CREATE TABLE movement  (
  id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  kind STRING NOT NULL,
  price_total DOUBLE NOT NULL,
  moment DATETIME NOT NULL
  
);

CREATE TABLE client  (
  cc STRING NOT NULL,
  name STRING ( 1 , 50 ) NOT NULL,
  phone STRING ,
  address STRING ,
  PRIMARY KEY( cc )
  
);

CREATE TABLE product  (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  name STRING ( 1 , 50 ) NOT NULL,
  stock DOUBLE NOT NULL,
  description STRING ( 0 , 50 ),
  cpp DOUBLE NOT NULL,
  price DOUBLE NOT NULL,
  category INTEGER ,
  FOREIGN KEY( category ) REFERENCES  Category ( id ) ON DELETE SET NULL
  
);

CREATE TABLE dealing (
  id  INTEGER PRIMARY KEY AUTOINCREMENT,
  product INTEGER NOT NULL,
  quantity DOUBLE NOT NULL,
  unit_price DOUBLE NOT NULL,
  movement INTEGER NOT NULL,
  FOREIGN KEY( product ) REFERENCES  Product ( id ) ON DELETE SET NULL,
  FOREIGN KEY( movement ) REFERENCES  Movement ( id ) ON DELETE SET NULL
  
);



CREATE TABLE payment  (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  credit INTEGER NOT NULL,
  moment DATETIME NOT NULL,
  price DOUBLE NOT NULL,
  FOREIGN KEY( credit ) REFERENCES  Credit ( id )
  
);

CREATE TABLE external_payment  (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  description STRING NOT NULL,
  price_total DOUBLE NOT NULL,
  movement INTEGER NOT NULL,
  FOREIGN KEY( movement ) REFERENCES  Movement ( id ) ON DELETE SET NULL
  
);

CREATE TABLE credit  (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  client INTEGER NOT NULL,
  movement INTEGER NOT NULL,
  FOREIGN KEY( client ) REFERENCES  Client ( cc ),
  FOREIGN KEY( movement ) REFERENCES  Movement ( id ) ON DELETE SET NULL
  
);
