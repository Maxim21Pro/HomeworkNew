CREATE SCHEMA country_storage;

SET SEARCH_PATH = country_storage;

CREATE TABLE country
(
    id                SERIAL,
    name              CHARACTER VARYING(64) UNIQUE NOT NULL,
    population        DECIMAL,
    area              INTEGER,
    official_language CHARACTER VARYING(64)
);

INSERT INTO country(name, population, area, official_language)
VALUES ('Беларусь', 9.349645, 207600, 'белорусский'),
       ('Росссия', 146.171015, 17125191, 'русский'),
       ('Литва', 2.795175, 65301, 'литовский'),
       ('Молдавия', 2.913281, 33846, 'молдавский'),
       ('Латвия', 1.8937, 64589, 'латвийский'),
       ('Эстония', 1.330068, 45227, 'эстонский'),
       ('Китай', 1415.515674, 9598962, 'китайский'),
       ('Польша', 38.623221, 312679, 'польский'),
       ('Италия', 59.236213, 302073, 'итальянский'),
       ('Франция', 68.084217, 643801, 'французский')
;

SELECT n.name
FROM country n
WHERE n.population > 50;

SELECT n.name
FROM country n
ORDER BY n.area ASC;

SELECT *, REPLACE(n.official_language, 'польский', 'белорусский')
FROM country n;

DELETE
FROM country n
WHERE n.population = (SELECT MAX(n.population) FROM country n);