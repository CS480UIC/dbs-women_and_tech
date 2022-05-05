-- MySQL dump 10.13  Distrib 8.0.25, for macos11 (x86_64)
--
-- Host: 127.0.0.1    Database: women_in_tech
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `learning_resource`
--

DROP TABLE IF EXISTS `learning_resource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `learning_resource` (
  `resource_id` tinyint unsigned NOT NULL,
  `member_id` tinyint unsigned NOT NULL,
  `resource_title` varchar(100) NOT NULL,
  `resource_type` varchar(100) NOT NULL,
  `author` varchar(100) NOT NULL,
  `publisher` varchar(100) DEFAULT NULL,
  `publish_year` int NOT NULL,
  `resource_language` varchar(100) NOT NULL,
  PRIMARY KEY (`resource_id`),
  KEY `member_id` (`member_id`),
  CONSTRAINT `learning_resource_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `member_user` (`member_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `learning_resource`
--

LOCK TABLES `learning_resource` WRITE;
/*!40000 ALTER TABLE `learning_resource` DISABLE KEYS */;
INSERT INTO `learning_resource` VALUES (30,5,'Why we have too few women leaders','Speech','Sheryl Sandberg',' ','2010-12-21 00:00:00','English'),(60,4,'Speeches by Women in Tech','Speech','Johanna Blakley',' ','2011-02-02 00:00:00','English'),(109,3,'Hidden Figures','Drama Film','Margot Lee Shetterly',' ','2017-01-06 00:00:00','English'),(121,1,'Brotopia: Breaking Up the Boys','Book','Emily Chang','Portfolio; First Edition','2018-02-06 00:00:00','English'),(123,2,'Female Innovators at Work: Women on Top of Tech by Danielle Newnham','Book','Danielle Newnham','Apress; 1st ed. edition','2016-11-18 00:00:00','English');
/*!40000 ALTER TABLE `learning_resource` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `member_user`
--

DROP TABLE IF EXISTS `member_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `member_user` (
  `member_id` tinyint unsigned NOT NULL AUTO_INCREMENT,
  `member_password` varchar(100) NOT NULL,
  `first_name` varchar(100) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `birthday` date NOT NULL,
  `education_level` varchar(200) DEFAULT NULL,
  `email` varchar(200) NOT NULL,
  `bio` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`member_id`),
  UNIQUE KEY `member_id` (`member_id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member_user`
--

LOCK TABLES `member_user` WRITE;
/*!40000 ALTER TABLE `member_user` DISABLE KEYS */;
INSERT INTO `member_user` VALUES (1,'\"bnmdxcfghj\"','\"Joann \"','\"Chan\"','1998-11-26','\"Senior in College\"','\"jchan49@uic.edu\"','\"Hi I am Joann\"'),(2,'\"dfcvgbhnj\"','\"Jenny\"','\"Tu\"','1998-03-04','\"Freshman in College\"','\"jennyThbj@uic.edu\"','\"Hi I am Jenny\"'),(3,'\"fvbgnjm\"','\"Kennedy\"','\"Tam\"','1998-04-07','\"high school\"','\"kenT@gmail.edu\"','\"Hi i am Ken\"'),(4,'\"mjnhbgvf\"','\"Daisy\"','\"Yim\"','1999-06-08','\"Junior in College\"','\"daisyY@gmail.edu\"','\"Hi I am Daisy\"'),(5,'\"hbtgrvfe\"','\"Ryan\"','\"Qin\"','1972-03-09','\"First year Grad\"','\"ryanQ@gmail.edu\"','\"Hi I am Ryan\"'),(6,'\"uyjhntg\"','\"Billy\"','\"Bob\"','1992-02-28','\"PHD\"','\"b_bob@gmail.com\"','\"Hi I\'m Bob!\"'),(7,'\"rgtbfvythu\"','\"Paulin\"','\"Neutron\"','2001-04-01','\"PHD\"','\"paul@genius.com\"','\"Hi, I\'m Paul!\"'),(8,'\"gtrefdsju7\"','\"Joann \"','\"Doe\"','1998-11-16','\"MS\"','\"jdoe@yahoo.com\"','\"Hi I\'m Joe Doe!\"'),(9,'\"i7khtygr\"','\"Jane\"','\"Doe\"','1985-01-01','\"MS\"','\"j.doe@yahoo.com\"','\"Hi I\'m Jane Doe!\"'),(10,'\"64e5rtg\"','\"Margot\"','\"Bobfree\"','1987-12-14','\"MS\"','\"m.bobfree@yahoo.com\"','\"Hi, I\'m Marcus!\"'),(11,'\"7ik5ju6rhy\"','\"Sunny\"','\"Joehill\"','2013-06-10','\"BS\"','\"zig-free@yahoo.com\"','\"Hi, people call me Ziggy!\"');
/*!40000 ALTER TABLE `member_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mentee`
--

DROP TABLE IF EXISTS `mentee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mentee` (
  `member_id` tinyint unsigned NOT NULL,
  `field_of_interest` varchar(200) DEFAULT NULL,
  `major` varchar(200) DEFAULT NULL,
  `school_name` varchar(400) DEFAULT NULL,
  PRIMARY KEY (`member_id`),
  UNIQUE KEY `member_id` (`member_id`),
  CONSTRAINT `mentee_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `member_user` (`member_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mentee`
--

LOCK TABLES `mentee` WRITE;
/*!40000 ALTER TABLE `mentee` DISABLE KEYS */;
INSERT INTO `mentee` VALUES (1,'\"UI/UX\"','\"Computer Science\"','\"UIC\"'),(2,'\"unknown\"','\"undecided\"','\"UIUC\"'),(3,'\"Back-end development\"','\"CS\"','\"University of Illinois at Chicago\"'),(4,'\"front end development\"','\"undecided\"','\"IIT\"'),(5,'\"Undecided\"','\"CS\"','\"Northwestern University\"');
/*!40000 ALTER TABLE `mentee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mentor`
--

DROP TABLE IF EXISTS `mentor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mentor` (
  `member_id` tinyint unsigned NOT NULL,
  `years_in_industry` smallint unsigned NOT NULL,
  `role_in_industry` varchar(200) NOT NULL,
  `years_of_mentoring` smallint unsigned NOT NULL,
  PRIMARY KEY (`member_id`),
  UNIQUE KEY `member_id` (`member_id`),
  CONSTRAINT `mentor_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `member_user` (`member_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mentor`
--

LOCK TABLES `mentor` WRITE;
/*!40000 ALTER TABLE `mentor` DISABLE KEYS */;
INSERT INTO `mentor` VALUES (6,5,'\"Software Engineer\"',5),(7,10,'\"Product Manager\"',7),(8,8,'\"Senior Product Manager\"',2),(9,2,'\"Full Stack Developer\"',1),(10,15,'\"UI/UX Designer\"',10);
/*!40000 ALTER TABLE `mentor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mentor_mentee`
--

DROP TABLE IF EXISTS `mentor_mentee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mentor_mentee` (
  `mentor_id` tinyint unsigned NOT NULL,
  `mentee_id` tinyint unsigned NOT NULL,
  PRIMARY KEY (`mentor_id`,`mentee_id`),
  UNIQUE KEY `mentor_id` (`mentor_id`),
  UNIQUE KEY `mentee_id` (`mentee_id`),
  CONSTRAINT `mentor_mentee_ibfk_1` FOREIGN KEY (`mentor_id`) REFERENCES `mentor` (`member_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `mentor_mentee_ibfk_2` FOREIGN KEY (`mentee_id`) REFERENCES `mentee` (`member_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mentor_mentee`
--

LOCK TABLES `mentor_mentee` WRITE;
/*!40000 ALTER TABLE `mentor_mentee` DISABLE KEYS */;
/*!40000 ALTER TABLE `mentor_mentee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `network_event`
--

DROP TABLE IF EXISTS `network_event`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `network_event` (
  `event_id` tinyint unsigned NOT NULL,
  `member_id` tinyint unsigned NOT NULL,
  `event_title` varchar(200) NOT NULL,
  `event_address` varchar(200) NOT NULL,
  `event_date` date NOT NULL,
  PRIMARY KEY (`event_id`),
  KEY `member_id` (`member_id`),
  CONSTRAINT `network_event_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `member_user` (`member_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `network_event`
--

LOCK TABLES `network_event` WRITE;
/*!40000 ALTER TABLE `network_event` DISABLE KEYS */;
INSERT INTO `network_event` VALUES (110,5,'Women in Cloud: #WICxAnnualSummit 2022: Collective Influence','Virtual','2022-01-26 00:00:00'),(119,3,'Women in Tech 3rd March - Lightning Talks!','On Meetup.com','2022-04-22 00:00:00'),(121,2,'AAUW Tech Savvy','Wisconsin','2022-03-09 00:00:00'),(122,4,'Wisdom 2.0','Mountain View, CA','2022-01-24 00:00:00'),(123,1,'Wonder Women: Celebrating Women in Tech 2022','432 N Lake St, Madison, WI','2022-03-02 00:00:00');
/*!40000 ALTER TABLE `network_event` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `scholarship`
--

DROP TABLE IF EXISTS `scholarship`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `scholarship` (
  `scholarship_id` tinyint unsigned NOT NULL,
  `scholarship_name` varchar(200) NOT NULL,
  `scholarship_amount` smallint unsigned NOT NULL,
  `scholarship_description` varchar(500) NOT NULL,
  `application_deadline` datetime NOT NULL,
  `application_released` datetime NOT NULL,
  `requirements` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`scholarship_id`),
  UNIQUE KEY `scholarship_name` (`scholarship_name`),
  UNIQUE KEY `scholarship_id` (`scholarship_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scholarship`
--

LOCK TABLES `scholarship` WRITE;
/*!40000 ALTER TABLE `scholarship` DISABLE KEYS */;
INSERT INTO `scholarship` VALUES (1,'\"Coding Bootcamp Scholarships\"',1000,'\"Our coding bootcamp scholarship directory features more than 40 unique scholarships\"','2022-03-09 00:00:00','2022-02-04 00:00:00','\"GPA must be at least 4\"'),(2,'\"Flatiron School Scholarships\"',7000,'\"The Women Take Tech Initiative scholarship awards a 50% discount on tuition to females\"','2022-03-25 00:00:00','2022-03-12 00:00:00','\"all Flatiron School campus-based and online courses globally\"'),(3,'\"Makers Academy Scholarship\"',700,'\"Any minorities or women who enroll in classes at the academy can receive a tuition discount\"','2022-05-10 00:00:00','2022-10-06 00:00:00','\"none\"'),(4,'\"Grand Circus Scholarship\"',1750,'\"Grand Circus is also using scholarships to help diversify the program and the tech industry in general\"','2021-11-04 00:00:00','2022-09-10 00:00:00','\"Anyone who identifies as a woman, Latinx, LGBTQ+, Native American, Black, or Veteran is eligible and recipients will be awarded $1,750\"'),(5,'\"BHW Scholarship\"',300,'\"DigitalCrafts is working to make tech careers more accessible to minority groups including female, Latinx, and Black students who are underrepresented in the tech industry\"','2022-08-12 00:00:00','2022-12-29 00:00:00','\"Women who are pursuing an undergraduate or master\'s degree and are majoring in science, technology, engineering, or mathematics during the 2022 school year\"');
/*!40000 ALTER TABLE `scholarship` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `scholarship_past_current_holder`
--

DROP TABLE IF EXISTS `scholarship_past_current_holder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `scholarship_past_current_holder` (
  `scholarship_id` tinyint unsigned NOT NULL,
  `past_holder` tinyint unsigned NOT NULL,
  `current_holder` tinyint unsigned NOT NULL,
  PRIMARY KEY (`scholarship_id`,`past_holder`,`current_holder`),
  UNIQUE KEY `scholarship_id` (`scholarship_id`),
  UNIQUE KEY `past_holder` (`past_holder`),
  UNIQUE KEY `current_holder` (`current_holder`),
  CONSTRAINT `scholarship_past_current_holder_ibfk_1` FOREIGN KEY (`scholarship_id`) REFERENCES `scholarship` (`scholarship_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `scholarship_past_current_holder_ibfk_2` FOREIGN KEY (`past_holder`) REFERENCES `member_user` (`member_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `scholarship_past_current_holder_ibfk_3` FOREIGN KEY (`current_holder`) REFERENCES `member_user` (`member_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scholarship_past_current_holder`
--

LOCK TABLES `scholarship_past_current_holder` WRITE;
/*!40000 ALTER TABLE `scholarship_past_current_holder` DISABLE KEYS */;
/*!40000 ALTER TABLE `scholarship_past_current_holder` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `special_interest_group`
--

DROP TABLE IF EXISTS `special_interest_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `special_interest_group` (
  `group_id` tinyint NOT NULL,
  `group_name` varchar(200) NOT NULL,
  `members_id` tinyint unsigned DEFAULT NULL,
  `mission_statement` varchar(500) DEFAULT NULL,
  `group_type` varchar(200) NOT NULL,
  `webpage_url` varchar(200) NOT NULL,
  `date_created` datetime NOT NULL,
  PRIMARY KEY (`group_id`),
  UNIQUE KEY `group_id` (`group_id`),
  UNIQUE KEY `group_name` (`group_name`),
  UNIQUE KEY `webpage_url` (`webpage_url`),
  UNIQUE KEY `members_id` (`members_id`),
  CONSTRAINT `special_interest_group_ibfk_1` FOREIGN KEY (`members_id`) REFERENCES `member_user` (`member_id`) ON DELETE SET NULL ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `special_interest_group`
--

LOCK TABLES `special_interest_group` WRITE;
/*!40000 ALTER TABLE `special_interest_group` DISABLE KEYS */;
INSERT INTO `special_interest_group` VALUES (1,'\Women_who_code\"',6,'\"Support women who code\"','\"tech\"','\"www.tech.edu\"','2022-03-01 00:00:00'),(2,'\"tech for women\"',7,'\"Help women break into tech\"','\"tech\"','\"www.tech4women.com\"','2022-02-08 00:00:00'),(3,'\"AI Exploration\"',8,'\"Learn about AI\"','\"AI\"','\"www.learnAI.com\"','2022-01-14 00:00:00'),(4,'\"Machine Learning Interest Group\"',9,'\"Learn about machine learning\"','\"Machine Learning\"','\"www.learMachine.com\"','2021-08-11 00:00:00'),(5,'\"Intro to Software Development\"',10,'\"Learn what it takes to become a software developer\"','\"Software Development\"','\"www.introtosoftware.com\"','2021-10-06 00:00:00');
/*!40000 ALTER TABLE `special_interest_group` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-31 23:48:51
