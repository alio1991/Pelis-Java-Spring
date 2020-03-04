DROP TABLE IF EXISTS `ACTOR` CASCADE;
DROP TABLE IF EXISTS `PELICULA` CASCADE;
CREATE TABLE `PELICULA`
(
    `id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `title` VARCHAR(255) NOT NULL, 
    `genre` VARCHAR(255),
    `year` VARCHAR(255),
    `oscars` VARCHAR(255)
);

CREATE TABLE `ACTOR`
(
    `id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(255),
    `surname` VARCHAR(255)
);


INSERT INTO `PELICULA` VALUES (default,'Star Wars','ficción','1995','0');
INSERT INTO `PELICULA` VALUES (default,'Señor Anillos','suspense','1999','0');
INSERT INTO `PELICULA` VALUES (default,'El Camino','drama','1985','0');
INSERT INTO `PELICULA` VALUES (default,'Anacleto','comedia','2010','2');

INSERT INTO `ACTOR` VALUES (default,'Fernando','Pérez');
INSERT INTO `ACTOR` VALUES (default,'Jessica','Jiménez');

INSERT INTO `ACTOR_PELICULA` VALUES (1,1);



 