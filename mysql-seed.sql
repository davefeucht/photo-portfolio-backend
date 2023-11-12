DROP TABLE IF EXISTS `category`;
CREATE TABLE category (
    id bigint,
    count int,
    description varchar(255),
    name varchar(255),
    taxonomy varchar(255),
    parent int
);

INSERT INTO `category` VALUES (1, 1, 'First catgory of photos', 'Photos1', '', -1);
INSERT INTO `category` VALUES (2, 1, 'Second catgory of photos', 'Photos2', '', -1);

DROP TABLE IF EXISTS `media`;
CREATE TABLE `media` (
    id bigint,
    alt_text varchar(255),
    author_id bigint,
    caption varchar(255),
    creation_date datetime,
    description varchar(255),
    guid varchar(255),
    link varchar(255)
);

INSERT INTO `media` VALUES (1, 'Media item', 1, 'This is a photo', '2023-01-01', 'Photo of something nice', 'asdasd23423', '/media/photo1');
INSERT INTO `media` VALUES (2, 'Media item', 1, 'This is another photo', '2023-01-01', 'Photo of something else nice', 'asdasd23423', '/media/photo2');
INSERT INTO `media` VALUES (3, 'Media item', 1, 'This is yet another photo', '2023-01-01', 'Photo of something else nice', 'asdasd23423', '/media/photo3');

DROP TABLE IF EXISTS `media_details`;
CREATE TABLE `media_details` (
    id bigint,
    width int,
    height int,
    media bigint,
    file varchar(255),
    media_type varchar(255),
    sizes varchar(255)
);

INSERT INTO `media_details` VALUES (1, 800, 600, 1, '', 'image/jpg', '1,2');
INSERT INTO `media_details` VALUES (2, 800, 600, 2, '', 'image/jpg', '1,2');

DROP TABLE IF EXISTS `media_size`;
CREATE TABLE `media_size` (
    id bigint,
    name varchar(255),
    file varchar(255),
    width int,
    height int,
    source_url varchar(255)
);

INSERT INTO `media_size` VALUES (1, 'small', '', 800, 600, '');
INSERT INTO `media_size` VALUES (1, 'medium', '', 1024, 768, '');

DROP TABLE IF EXISTS `site_info`;
CREATE TABLE `site_info` (
    description varchar(255),
    gmt_offset varchar(255),
    site_icon bigint,
    site_logo bigint,
    url varchar(255)
);

INSERT INTO `site_info` VALUES ('Photos from the real world', '+2', 1, 2, 'http://www.throughapinhole.com');

DROP TABLE IF EXISTS `page`;
CREATE TABLE `page` (
    id bigint,
    link varchar(255),
    modified datetime,
    type varchar(255),
    title varchar(255),
    content varchar(255),
    author_id bigint,
    featured_media_id bigint
);

INSERT INTO `page` VALUES (1, 'http://www.throughapinhole.com/page/about', '2023-01-01', 'page', 'About', 'This is a page about me', 1, NULL);

DROP TABLE IF EXISTS `post`;
CREATE TABLE `post` (
    id bigint,
    modified datetime,
    type varchar(255),
    title varchar(255),
    content varchar(255),
    author_id bigint,
    featured_media_id bigint,
    category_ids varchar(255),
    tag_ids varchar(255),
    thumbnail_image varchar(255)
);

INSERT INTO `post` VALUES (1, '2023-01-01', 'post', 'Nice Photo', 'This is a nice photo', 1, 3, "1,2", "1,2", "media/photo3_thumbnail");

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
    id bigint,
    login varchar(255),
    password varchar(255),
    email varchar(255),
    registered_date datetime,
    activation_key varchar(255),
    status int,
    display_name varchar(255),
    first_name varchar(255),
    last_name varchar(255),
    description varchar(255)
);

INSERT INTO `user` VALUES (1, 'davefeucht', '$P$BSBNMv56jjFQ8aAmEs8BPK20T.Z72y1', 'dave@test.com', '2014-03-03', '', 0, 'Dave Feucht', 'Dave', 'Feucht', 'I am me');
INSERT INTO `user` VALUES (2, 'stathisoikonomou', '$P$BSBNMv56jjFQ8aAmEs8BPK20T.Z72y1', 'stathis@test.com', '2014-03-03', '', 0, 'Statis Oikonomou', 'Stathis', 'Oikonomou', 'I am me');
INSERT INTO `user` VALUES (3, 'daniaabdel', '$P$BSBNMv56jjFQ8aAmEs8BPK20T.Z72y1', 'dania@test.com', '2014-03-03', '', 0, 'Dania Abdel', 'Dania', 'Abdel', 'I am me');
