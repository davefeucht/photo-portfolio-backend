CREATE TABLE IF NOT EXISTS Category (
    id int,
    count int,
    description varchar(255),
    name varchar(255),
    taxonomy varchar(255),
    parent int
);

CREATE TABLE IF NOT EXISTS Media (
    id bigint,
    altText varchar(255),
    authorId bigint,
    caption varchar(255),
    creationDate date,
    description varchar(255),
    guid varchar(255),
    link varchar(255)
);

CREATE TABLE IF NOT EXISTS MediaDetails (
    width int,
    height int,
    file varchar(255),
    mediaType varchar(255)
);

CREATE TABLE IF NOT EXISTS MediaSize (
    id bigint,
    name varchar(255),
    file varchar(255),
    width int,
    height int,
    sourceUrl varchar(255)
);

CREATE TABLE IF NOT EXISTS SiteInfo (
    description varchar(255),
    gmtOfffset varchar(255),
    siteIcon bigint,
    siteLogo bigint,
    url varchar(255)
);

CREATE TABLE IF NOT EXISTS Page (
    id bigint,
    link varchar(255),
    modified date,
    type varchar(255),
    title varchar(255),
    content varchar(255),
    authorId bigint,
    featuredMediaId bigint
);

CREATE TABLE IF NOT EXISTS Post (
    id bigint,
    modified date,
    type varchar(255),
    title varchar(255),
    content varchar(255),
    authorId bigint,
    featuredMediaId bigint,
    categoryIds bigint,
    tagIds bigint,
    thumbnailImage varchar(255)
);