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
  
  
