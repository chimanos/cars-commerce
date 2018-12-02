DROP TABLE IF EXISTS Car;

CREATE TABLE Car(id INT PRIMARY KEY,
                 name VARCHAR(255),
                 brand VARCHAR(255),
                 color VARCHAR(255),
                 nbPorte VARCHAR(255),
                 price VARCHAR(255));

INSERT INTO Car VALUES(1, 'Hello', 'Hello', 'Hello', 'Hello', 'Hello');
INSERT INTO Car VALUES(2, 'World', 'World', 'World', 'World', 'World');

SELECT * FROM Car ORDER BY ID;
