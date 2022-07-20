 USE `k8sDB`;
 DROP TABLE IF EXISTS `sample`;

 CREATE TABLE `sample`(
   `id` BIGINT(20) NOT NULL,
   `name` VARCHAR(255) DEFAULT NULL,
   `gender` VARCHAR(255) DEFAULT NULL
  );

 INSERT INTO sample VALUES (10, 'chy-001', 'MALE');
 INSERT INTO sample VALUES (11, 'chy-002', 'MALE');
 INSERT INTO sample VALUES (12, 'chy-003', 'MALE');
