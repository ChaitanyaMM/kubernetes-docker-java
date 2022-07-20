 USE `k8sDB`;
 DROP TABLE IF EXISTS `sample`;

 CREATE TABLE `sample`(
   `id` BIGINT(20) NOT NULL,
   `name` VARCHAR(255) DEFAULT NULL,
   `gender` VARCHAR(255) DEFAULT NULL
  );

 INSERT INTO sample VALUES (4, 'chy-004', 'MALE');
 INSERT INTO sample VALUES (5, 'chy-005', 'MALE');
 INSERT INTO sample VALUES (6, 'chy-006', 'MALE');
