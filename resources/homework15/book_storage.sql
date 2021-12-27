CREATE SCHEMA book_storage;

SET SEARCH_PATH = book_storage;

CREATE TABLE nationality
(
    id          SERIAL PRIMARY KEY,
    nationality CHARACTER VARYING(64) UNIQUE NOT NULL
);

CREATE TABLE genre
(
    id   SERIAL PRIMARY KEY,
    name CHARACTER VARYING(64) UNIQUE NOT NULL
);

CREATE TABLE author
(
    id             SERIAL PRIMARY KEY,
    name           CHARACTER VARYING(64) UNIQUE NOT NULL,
    date_of_birth  DATE,
    id_nationality INTEGER REFERENCES nationality (id)
);

CREATE TABLE book
(
    id              SERIAL PRIMARY KEY,
    name            CHARACTER VARYING(64) UNIQUE NOT NULL,
    number_of_pages INTEGER CHECK ( number_of_pages > 0 ),
    genre_id        INTEGER REFERENCES genre (id)
);

CREATE TABLE author_book
(
    id        SERIAL PRIMARY KEY,
    author_id INTEGER REFERENCES author (id) ON UPDATE CASCADE,
    book_id   INTEGER REFERENCES book (id) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO genre(name)
VALUES ('энциклопедия'),
       ('роман'),
       ('детектив'),
       ('фэнтези')
;

INSERT INTO nationality (nationality)
VALUES ('США'),
       ('Канада'),
       ('Англия'),
       ('Израиль'),
       ('Россия')
;

INSERT INTO book (name, number_of_pages, genre_id)
VALUES ('Изучаем Java', 720, (SELECT id FROM genre WHERE name = 'энциклопедия')),
       ('Паттерны проектирования', 640, (SELECT id FROM genre WHERE name = 'энциклопедия')),
       ('Изучаем HTML, XHTML и CSS', 720, (SELECT id FROM genre WHERE name = 'энциклопедия')),
       ('Гордость и предубеждение', 416, (SELECT id FROM genre WHERE name = 'роман')),
       ('Эмма', 480, (SELECT id FROM genre WHERE name = 'роман')),
       ('Нортенгерское аббатство', 480, (SELECT id FROM genre WHERE name = 'роман')),
       ('Как ты умрешь', 352, (SELECT id FROM genre WHERE name = 'роман')),
       ('Внутри убийцы', 416, (SELECT id FROM genre WHERE name = 'детектив')),
       ('Заживо в темноте', 416, (SELECT id FROM genre WHERE name = 'детектив')),
       ('Метро 2033', 384, (SELECT id FROM genre WHERE name = 'фэнтези'))
;

INSERT INTO author (name, date_of_birth, id_nationality)
VALUES ('Берт Бейтс', '1963-12-09', (SELECT id FROM nationality WHERE nationality = 'США')),
       ('Кэйти Сьерра', '1957-05-11', (SELECT id FROM nationality WHERE nationality = 'США')),
       ('Эрик Фримен', '1980-02-25', (SELECT id FROM nationality WHERE nationality = 'США')),
       ('Элизабет Робсон', '1982-07-03', (SELECT id FROM nationality WHERE nationality = 'Канада')),
       ('Джейн Остин', '1775-12-16', (SELECT id FROM nationality WHERE nationality = 'Канада')),
       ('Майк Омер', '1979-06-20', (SELECT id FROM nationality WHERE nationality = 'Израиль')),
       ('Дмитрий Глуховский', '1979-06-12', (SELECT id FROM nationality WHERE nationality = 'Россия'))
;

INSERT INTO author_book (author_id, book_id)
VALUES ((SELECT id FROM author WHERE name = 'Берт Бейтс'),
        (SELECT id FROM book WHERE name = 'Изучаем Java')),
       ((SELECT id FROM author WHERE name = 'Кэйти Сьерра'),
        (SELECT id FROM book WHERE name = 'Изучаем Java')),
       ((SELECT id FROM author WHERE name = 'Берт Бейтс'),
        (SELECT id FROM book WHERE name = 'Паттерны проектирования')),
       ((SELECT id FROM author WHERE name = 'Кэйти Сьерра'),
        (SELECT id FROM book WHERE name = 'Паттерны проектирования')),
       ((SELECT id FROM author WHERE name = 'Эрик Фримен'),
        (SELECT id FROM book WHERE name = 'Паттерны проектирования')),
       ((SELECT id FROM author WHERE name = 'Эрик Фримен'),
        (SELECT id FROM book WHERE name = 'Изучаем HTML, XHTML и CSS')),
       ((SELECT id FROM author WHERE name = 'Элизабет Робсон'),
        (SELECT id FROM book WHERE name = 'Изучаем HTML, XHTML и CSS')),
       ((SELECT id FROM author WHERE name = 'Джейн Остин'),
        (SELECT id FROM book WHERE name = 'Гордость и предубеждение')),
       ((SELECT id FROM author WHERE name = 'Джейн Остин'),
        (SELECT id FROM book WHERE name = 'Эмма')),
       ((SELECT id FROM author WHERE name = 'Джейн Остин'),
        (SELECT id FROM book WHERE name = 'Нортенгерское аббатство')),
       ((SELECT id FROM author WHERE name = 'Майк Омер'),
        (SELECT id FROM book WHERE name = 'Как ты умрешь')),
       ((SELECT id FROM author WHERE name = 'Майк Омер'),
        (SELECT id FROM book WHERE name = 'Внутри убийцы')),
       ((SELECT id FROM author WHERE name = 'Майк Омер'),
        (SELECT id FROM book WHERE name = 'Заживо в темноте')),
       ((SELECT id FROM author WHERE name = 'Дмитрий Глуховский'),
        (SELECT id FROM book WHERE name = 'Метро 2033'))
;

--авторы и книги
SELECT author.name AS book_author,
       book.name   AS book_name
FROM book,
     author
         LEFT JOIN author_book ab ON ab.author_id = author.id
WHERE ab.book_id = book.id;

-- книги авторов выбранной национальности
SELECT book.name AS book_name
FROM author,
     book
         RIGHT JOIN author_book ab ON ab.book_id = book.id
WHERE ab.author_id = author.id
  AND id_nationality = (SELECT id FROM nationality WHERE nationality = 'Израиль');

-- книги авторов>1900 года
SELECT book.name AS book_name
FROM author,
     book
         RIGHT JOIN author_book ab ON ab.book_id = book.id
WHERE ab.author_id = author.id
  AND (EXTRACT(YEAR FROM author.date_of_birth)) > 1900;

--удаление книги "Эмма"
DELETE
FROM book
WHERE book.name = 'Эмма';

--имя автора, национальность и среднее количество написанных им страниц, упорядочить по году рождения автора
SELECT a.name                 AS author,
       nationality            AS author_nationality,
       AVG(b.number_of_pages) AS av_number_of_pages
FROM author a,
     author_book ab,
     nationality n,
     book b
WHERE ab.author_id = a.id
  AND b.id = ab.book_id
  AND n.id = a.id_nationality
GROUP BY author, author_nationality
ORDER BY author;

--имя автора, национальность и среднее количество написанных им страниц, где среднее число страниц больше 400
SELECT a.name                 AS author,
       nationality            AS author_nationality,
       AVG(b.number_of_pages) AS av_number_of_pages
FROM author a,
     author_book ab,
     nationality n,
     book b
WHERE ab.author_id = a.id
  AND b.id = ab.book_id
  AND n.id = a.id_nationality
GROUP BY author, author_nationality
HAVING AVG(b.number_of_pages) > 400







