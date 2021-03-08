1. CREATE DEFINER=`root`@`localhost` PROCEDURE `getMovieName`()
BEGIN
select moviename from movie where movietype like "drama%"; 
END

output : 

	moviename:
	Padmavaat
	Badhaai Ho
	Rangoon
	Bahubali-The_Beginning
	Maryada Ramanna
	Khaidi No. 150
	The Villain
  
  
  2. USE `activity1`;
DROP procedure IF EXISTS `new_procedure1`;

DELIMITER $$
USE `activity1`$$
CREATE PROCEDURE `new_procedure1` ()
BEGIN
select * from production;

END$$

DELIMITER ;



3. USE `activity1`;
DROP procedure IF EXISTS `getDetails`;

DELIMITER $$
USE `activity1`$$
CREATE PROCEDURE `getDetails` ()
BEGIN
 select moviename from movie where language like "h%";
END$$

DELIMITER ;
  
