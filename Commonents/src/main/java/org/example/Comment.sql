/*
SQLyog Ultimate v11.25 (64 bit)
MySQL - 8.0.39 : Database - Comment
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`Comment` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `Comment`;

/*Table structure for table `person` */

DROP TABLE IF EXISTS `person`;

CREATE TABLE `person` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `Age` int DEFAULT NULL,
  `Birthday` date DEFAULT NULL,
  `in_companytime` date DEFAULT NULL,
  `telephone` int DEFAULT NULL,
  `is_company` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `person` */

insert  into `person`(`id`,`username`,`address`,`Age`,`Birthday`,`in_companytime`,`telephone`,`is_company`) values (1,'李四','辽宁',19,'2025-11-14','2025-11-14',139865637,1),(2,'王五','吉林',20,'2025-11-20','2025-11-14',89561365,1),(3,'李九','香港',23,'2025-10-31','2025-11-01',12665432,1),(4,'张其','台湾',19,'2025-10-09','2025-11-10',166545632,1),(5,'王五','云南',20,'2025-11-02','2025-11-02',15523456,1),(6,'赵六','杭州',23,'2025-11-14','2025-11-02',13323564,1),(7,'九三','浙江',16,'2025-11-01','2025-11-01',12232123,0),(8,'九一','江苏',22,'2025-11-01','2025-11-06',13323132,1),(9,'麻豆','河南',23,'2025-11-16','2025-11-02',11553212,1),(11,'李华','美国',19,'2025-03-16','2025-08-16',136598632,0),(14,'黎明','北京',0,NULL,'2025-11-05',1385965486,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
