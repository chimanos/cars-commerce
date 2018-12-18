DROP TABLE IF EXISTS Car;
DROP TABLE IF EXISTS Users;

CREATE TABLE Car(id INT,
                 nameCar VARCHAR(255),
                 description VARCHAR(255),
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

INSERT INTO Car VALUES(1, 'Model 3', 'La Tesla Model 3 est une berline électrique, simple et abordable.', 'Tesla', 'Rouge', '5', 'BERLINE', 'http://image.noelshack.com/fichiers/2018/51/2/1545155777-teslamodel3.jpg', '35000');
INSERT INTO Car VALUES(2, '508 3', 'La 508 dispose d''un extérieur plus affirmé et un contenu technologique renforcé.', 'Peugeot', 'Bleu', '5', 'BERLINE', 'http://image.noelshack.com/fichiers/2018/51/2/1545155853-508.jpg', '38000');
INSERT INTO Car VALUES(3, 'Classe C', 'La Nouvelle Classe C est prête à prendre le départ.', 'Mercedes', 'Blanc', '5', 'BERLINE', 'http://image.noelshack.com/fichiers/2018/51/2/1545155878-mercedes-classe-c-2018-01.jpg', '55000');

INSERT INTO Car VALUES(4, 'Model X', 'La Tesla Model X est un SUV électrique, simple et puissant.', 'Tesla', 'Rouge', '5', 'SUV', 'http://image.noelshack.com/fichiers/2018/51/2/1545157750-modelx.png', '100000');
INSERT INTO Car VALUES(5, 'X6', 'Prenez les rênes : la BMW X6 est faite pour ceux qui aiment le mouvement.', 'BMW', 'Bleu', '5', 'SUV', 'http://image.noelshack.com/fichiers/2018/51/2/1545157772-x6.png', '75000');
INSERT INTO Car VALUES(6, 'Q8', 'La Audi Q8 adopte un tempérament de baroudeur.', 'Audi', 'Orange', '5', 'SUV', 'http://image.noelshack.com/fichiers/2018/51/2/1545157791-audiq8.png', '80000');

INSERT INTO Car VALUES(7, 'Model S', 'La Model S a été conçue pour être la berline la plus sûre et la plus exaltante', 'Tesla', 'Rouge', '5', 'SPORTIVE', 'http://image.noelshack.com/fichiers/2018/51/2/1545157811-2016-tesla-model-s-60-front-three-quarter-in-motion-02-e1477952073682.jpg', '90000');
INSERT INTO Car VALUES(8, '718 Cayman GTS', 'La 718 Cayman est faite pour ceux qui aiment le mouvement.', 'Porsche', 'Bleu', '3', 'SPORTIVE', 'http://image.noelshack.com/fichiers/2018/51/2/1545157837-cayman.png', '80000');
INSERT INTO Car VALUES(9, 'M4', 'La nouvelle BMW M4 CS est un modèle spécial haute performances', 'BMW', 'Blanc', '3', 'SPORTIVE', 'http://image.noelshack.com/fichiers/2018/51/2/1545157881-bmw-f82-cs-stage2-ts-01.jpg', '95000');

INSERT INTO Users VALUES(1, 'test', 'Romain', 'Pamart', 'romain.pamart@uphf.fr', 'test');

SELECT * FROM Car ORDER BY id;
SELECT * FROM Users ORDER BY id;
