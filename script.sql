DROP TABLE IF EXISTS Car;
DROP TABLE IF EXISTS Users;

CREATE TABLE Car(id INT,
                 nameCar VARCHAR(255),
                 brand VARCHAR(255),
                 color VARCHAR(255),
                 nbPorte VARCHAR(255),
                 carType VARCHAR(255),
                 pictureUrl VARCHAR(255),
                 price VARCHAR(255),
                 PRIMARY KEY (id, nameCar));

CREATE TABLE Users(id INT,
                   pseudo VARCHAR(255),
                   firstname VARCHAR(255),
                   lastname VARCHAR(255),
                   email VARCHAR(255),
                   password VARCHAR(255),
                   PRIMARY KEY (id, pseudo));

INSERT INTO Car VALUES(1, 'Model 3', 'Tesla', 'Rouge', '5', 'BERLINE', '', '35000');
INSERT INTO Car VALUES(2, '508 3', 'Peugeot', 'Bleu', '5', 'BERLINE', '', '38000');
INSERT INTO Car VALUES(3, 'Classe C', 'Mercedes', 'Blanc', '5', 'BERLINE', '', '55000');

INSERT INTO Car VALUES(4, 'Model X', 'Tesla', 'Rouge', '5', 'SUV', '', '100000');
INSERT INTO Car VALUES(5, 'X6', 'BMW', 'Bleu', '5', 'SUV', '', '75000');
INSERT INTO Car VALUES(6, 'Q8', 'Audi', 'Orange', '5', 'SUV', '', '80000');

INSERT INTO Car VALUES(7, 'Model S', 'Tesla', 'Rouge', '5', 'SPORTIVE', '', '90000');
INSERT INTO Car VALUES(8, '718 Cayman GTS', 'Porsche', 'Bleu', '3', 'SPORTIVE', '', '80000');
INSERT INTO Car VALUES(9, 'M4', 'BMW', 'Blanc', '3', 'SPORTIVE', '', '95000');

INSERT INTO Users VALUES(1, 'test', 'Romain', 'Pamart', 'romain.pamart@uphf.fr', 'test');

SELECT * FROM Car ORDER BY id;
SELECT * FROM Users ORDER BY id;
