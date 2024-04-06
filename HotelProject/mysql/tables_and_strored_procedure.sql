
# Table	Create Table
CREATE TABLE `person` (
  `cin` int NOT NULL,
  `FN` varchar(50) NOT NULL,
  `LN` varchar(50) NOT NULL,
  `phone` int NOT NULL,
  `email` varchar(100) NOT NULL,
  PRIMARY KEY (`cin`),
  KEY `cinCl` (`cin`),
  KEY `idx_cinCl` (`cin`)
);

# Table	Create Table
CREATE TABLE `employees` (
  `cinEmp` int NOT NULL,
  `FNEmp` varchar(50) NOT NULL,
  `LNEmp` varchar(50) NOT NULL,
  `emailEmp` varchar(500) NOT NULL,
  `phoneEmp` int NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `securityquestion` varchar(500) NOT NULL,
  `answer` varchar(200) NOT NULL,
  `status` varchar(10) NOT NULL DEFAULT 'false',
  PRIMARY KEY (`cinEmp`)
);


# Table, Create Table
CREATE TABLE `roomtype` (
  `type` varchar(45) NOT NULL,
  `price` int NOT NULL,
  `room_type_id` int NOT NULL,
  PRIMARY KEY (`room_type_id`),
  UNIQUE KEY `type` (`type`),
  KEY `idx_room_type_id` (`room_type_id`)
);

# Table	Create Table
CREATE TABLE `room` (
  `room_id` int NOT NULL AUTO_INCREMENT,
  `room_no` varchar(45) NOT NULL,
  `bed_number` int NOT NULL,
  `tv` boolean NOT NULL,
  `wifi` boolean NOT NULL,
  `stove` boolean NOT NULL,
  `phone` boolean NOT NULL,
  `room_class` varchar(45) NOT NULL,
  `room_class_id` int NOT NULL,
  PRIMARY KEY (`room_id`),
  KEY `room_class_id` (`room_class_id`),
  KEY `idx_room_no` (`room_no`),
  CONSTRAINT `room_ibfk_1` FOREIGN KEY (`room_class_id`) REFERENCES `roomtype` (`room_type_id`)
);



# Table, Create Table
CREATE TABLE `booking` (
  `booking_id` int NOT NULL AUTO_INCREMENT,
  `customer_id` int NOT NULL,
  `booking_room` varchar(50) NOT NULL,
  `guests` int NOT NULL,
  `check_in` datetime NOT NULL,
  `check_out` datetime NOT NULL,
  `booking_type` varchar(20) NOT NULL,
  `has_checked_out` boolean NOT NULL DEFAULT 'false',
  PRIMARY KEY (`booking_id`),
  KEY `fk_customer_booking` (`customer_id`),
  KEY `fk_room_booking` (`booking_room`),
  CONSTRAINT `fk_customer_booking` FOREIGN KEY (`customer_id`) REFERENCES `person` (`cin`),
  CONSTRAINT `fk_room_booking` FOREIGN KEY (`booking_room`) REFERENCES `room` (`room_no`)
);
#stored procedurereservation_stats

USE hotel;
DROP PROCEDURE IF EXISTS reservation_stats;

DELIMITER $$

CREATE PROCEDURE reservation_stats()
BEGIN
DECLARE done INT DEFAULT FALSE;
DECLARE month_val INT;
DECLARE num_reservations_val INT;
DECLARE monthly_revenue_val INT;
DECLARE cur CURSOR FOR
SELECT
MONTH(check_in) AS month,
COUNT(*) AS num_reservations,
SUM(DATEDIFF(check_out, check_in) * roomtype.price) AS monthly_revenue
FROM booking
JOIN person ON booking.customer_id = person.cin
JOIN room ON booking.booking_room = room.room_no
JOIN roomtype ON room.room_class_id = roomtype.room_type_id
GROUP BY month
ORDER BY month;
DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;
DROP TABLE IF EXISTS reservation_stats_tbl;
CREATE TABLE reservation_stats_tbl (
month_val INT,
num_reservations_val INT,
monthly_revenue_val INT
);
OPEN cur;
read_loop: LOOP
FETCH cur INTO month_val, num_reservations_val, monthly_revenue_val;
IF done THEN
LEAVE read_loop;
END IF;
INSERT INTO reservation_stats_tbl VALUES (month_val, num_reservations_val, monthly_revenue_val);
END LOOP;
CLOSE cur;
SELECT * FROM reservation_stats_tbl;
END$$

DELIMITER ;



CALL reservation_stats();