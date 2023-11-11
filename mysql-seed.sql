DROP TABLE IF EXISTS `Category`;
CREATE TABLE Category (
    id bigint,
    count int,
    description varchar(255),
    name varchar(255),
    taxonomy varchar(255),
    parent int
);

INSERT INTO `Category` VALUES (1, 1, 'First catgory of photos', 'Photos1', '', -1);
INSERT INTO `Category` VALUES (2, 1, 'Second catgory of photos', 'Photos2', '', -1);

DROP TABLE IF EXISTS `Media`;
CREATE TABLE `Media` (
    id bigint,
    altText varchar(255),
    authorId bigint,
    caption varchar(255),
    creationDate datetime,
    description varchar(255),
    guid varchar(255),
    link varchar(255)
);

INSERT INTO `Media` VALUES (1, 'Media item', 1, 'This is a photo', '2023-01-01', 'Photo of something nice', 'asdasd23423', '/media/photo1');
INSERT INTO `Media` VALUES (2, 'Media item', 1, 'This is another photo', '2023-01-01', 'Photo of something else nice', 'asdasd23423', '/media/photo2');
INSERT INTO `Media` VALUES (3, 'Media item', 1, 'This is yet another photo', '2023-01-01', 'Photo of something else nice', 'asdasd23423', '/media/photo3');

DROP TABLE IF EXISTS `MediaDetails`;
CREATE TABLE `MediaDetails` (
    id bigint,
    width int,
    height int,
    media bigint,
    file varchar(255),
    mediaType varchar(255),
    sizes varchar(255)
);

INSERT INTO `MediaDetails` VALUES (1, 800, 600, 1, '', 'image/jpg', '1,2');
INSERT INTO `MediaDetails` VALUES (2, 800, 600, 2, '', 'image/jpg', '1,2');

DROP TABLE IF EXISTS `MediaSize`;
CREATE TABLE `MediaSize` (
    id bigint,
    name varchar(255),
    file varchar(255),
    width int,
    height int,
    sourceUrl varchar(255)
);

INSERT INTO `MediaSize` VALUES (1, 'small', '', 800, 600, '');
INSERT INTO `MediaSize` VALUES (1, 'medium', '', 1024, 768, '');

DROP TABLE IF EXISTS `SiteInfo`;
CREATE TABLE `SiteInfo` (
    description varchar(255),
    gmtOfffset varchar(255),
    siteIcon bigint,
    siteLogo bigint,
    url varchar(255)
);

INSERT INTO `SiteInfo` VALUES ('Photos from the real world', '+2', 1, 2, 'http://www.throughapinhole.com');

DROP TABLE IF EXISTS `Page`;
CREATE TABLE `Page` (
    id bigint,
    link varchar(255),
    modified datetime,
    type varchar(255),
    title varchar(255),
    content varchar(255),
    authorId bigint,
    featuredMediaId bigint
);

INSERT INTO `Page` VALUES (1, 'http://www.throughapinhole.com/page/about', '2023-01-01', 'page', 'About', 'This is a page about me', 1, NULL);

DROP TABLE IF EXISTS `Post`;
CREATE TABLE `Post` (
    id bigint,
    modified datetime,
    type varchar(255),
    title varchar(255),
    content varchar(255),
    authorId bigint,
    featuredMediaId bigint,
    categoryIds varchar(255),
    tagIds varchar(255),
    thumbnailImage varchar(255)
);

INSERT INTO `Post` VALUES (1, '2023-01-01', 'post', 'Nice Photo', 'This is a nice photo', 1, 3, "1,2", "1,2", "media/photo3_thumbnail");

DROP TABLE IF EXISTS `User`;
CREATE TABLE `User` (
    id bigint,
    login varchar(255),
    password varchar(255),
    email varchar(255),
    registeredDate datetime,
    activationKey varchar(255),
    status int,
    displayName varchar(255),
    firstName varchar(255),
    lastName varchar(255),
    description varchar(255)
);

INSERT INTO `User` VALUES (1, 'davefeucht', '$P$BSBNMv56jjFQ8aAmEs8BPK20T.Z72y1', 'dave@test.com', '2014-03-03', '', 0, 'Dave Feucht', 'Dave', 'Feucht', 'I am me');
INSERT INTO `User` VALUES (2, 'stathisoikonomou', '$P$BSBNMv56jjFQ8aAmEs8BPK20T.Z72y1', 'stathis@test.com', '2014-03-03', '', 0, 'Statis Oikonomou', 'Stathis', 'Oikonomou', 'I am me');
INSERT INTO `User` VALUES (3, 'daniaabdel', '$P$BSBNMv56jjFQ8aAmEs8BPK20T.Z72y1', 'dania@test.com', '2014-03-03', '', 0, 'Dania Abdel', 'Dania', 'Abdel', 'I am me');
