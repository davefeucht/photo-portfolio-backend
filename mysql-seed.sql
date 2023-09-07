CREATE TABLE IF NOT EXISTS Category (
    id int,
    count int,
    description varchar(255),
    name varchar(255),
    taxonomy varchar(255),
    parent int
);

CREATE TABLE IF NOT EXISTS Media (
    altText varchar(255),
    authorId int,
    caption varchar(255),
    creationDate date,
    description varchar(255),
    guid varchar(255),
    id int,
    link varchar(255)
);

CREATE TABLE IF NOT EXISTS MediaDetails (
    width int,
    height int,
    file VARCHAR(255),
    mediaType VARCHAR(255)
);