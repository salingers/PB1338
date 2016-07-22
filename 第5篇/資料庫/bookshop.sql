/*
SQLyog Enterprise - MySQL GUI v6.03
Host - 5.5.8 : Database - bookshop
*********************************************************************
Server version : 5.5.8
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

create database if not exists `bookshop`;

USE `bookshop`;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

/*Table structure for table `books` */

DROP TABLE IF EXISTS `books`;

CREATE TABLE `books` (
  `Id` int(4) NOT NULL AUTO_INCREMENT,
  `Title` varchar(16) NOT NULL,
  `Author` varchar(16) NOT NULL,
  `PublisherId` int(4) NOT NULL,
  `PublisherDate` int(4) DEFAULT NULL,
  `ISBN` varchar(16) DEFAULT NULL,
  `WordsCount` int(4) DEFAULT NULL,
  `UnitPrice` decimal(8,0) DEFAULT NULL,
  `ContentDescription` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `FK_books` (`PublisherId`),
  CONSTRAINT `FK_books` FOREIGN KEY (`PublisherId`) REFERENCES `publishers` (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4954 DEFAULT CHARSET=gb2312;

/*Data for the table `books` */

insert  into `books`(`Id`,`Title`,`Author`,`PublisherId`,`PublisherDate`,`ISBN`,`WordsCount`,`UnitPrice`,`ContentDescription`) values (4939,'C++ Primer中文版','（美）Stanley B。',2,NULL,NULL,NULL,'55',NULL),(4943,'Effective C# 中','（美）瓦格纳 著',2,NULL,NULL,NULL,'45',NULL),(4944,'C程序设计语言','（美）克尼汉',3,2004,'9787111128069',482000,'30','本书是由C语言的'),(4946,'框架设计（第2版)','（美）瑞奇特',1,2006,'9787302140160',891000,'68','作为深受编程人员'),(4947,'C++程序设计教程','钱能  著',1,2005,'9787302114642',891000,'40','本书是《C++程序'),(4953,'Web应用开发技术','崔尚森，张白一',3,NULL,NULL,NULL,'56',NULL);

/*Table structure for table `course` */

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `CourseId` int(4) NOT NULL AUTO_INCREMENT,
  `CourseName` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`CourseId`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

/*Data for the table `course` */

/*Table structure for table `publishers` */

DROP TABLE IF EXISTS `publishers`;

CREATE TABLE `publishers` (
  `Id` int(4) NOT NULL AUTO_INCREMENT,
  `Name` varchar(16) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=gb2312;

/*Data for the table `publishers` */

insert  into `publishers`(`Id`,`Name`) values (1,'清华大学出版社'),(2,'人民邮电出版社'),(3,'机械工业出版社');

/*Table structure for table `sc` */

DROP TABLE IF EXISTS `sc`;

CREATE TABLE `sc` (
  `Sid` int(4) NOT NULL,
  `Cid` int(4) NOT NULL,
  PRIMARY KEY (`Cid`,`Sid`),
  KEY `FK_sc` (`Sid`),
  KEY `sc` (`Cid`),
  CONSTRAINT `FK_cid` FOREIGN KEY (`Cid`) REFERENCES `course` (`CourseId`),
  CONSTRAINT `FK_sid` FOREIGN KEY (`Sid`) REFERENCES `student` (`StudentId`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

/*Data for the table `sc` */

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `StudentId` int(4) NOT NULL AUTO_INCREMENT,
  `StudentName` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`StudentId`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

/*Data for the table `student` */

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `Id` int(4) NOT NULL AUTO_INCREMENT,
  `LoginName` varchar(50) DEFAULT NULL,
  `LoginPwd` varchar(16) DEFAULT NULL,
  `Name` varchar(16) DEFAULT NULL,
  `Address` varchar(16) DEFAULT NULL,
  `Phone` varchar(16) DEFAULT NULL,
  `Mail` varchar(16) DEFAULT NULL,
  `UserRoleId` int(4) DEFAULT NULL,
  `UserStateId` int(4) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=gb2312;

/*Data for the table `users` */

insert  into `users`(`Id`,`LoginName`,`LoginPwd`,`Name`,`Address`,`Phone`,`Mail`,`UserRoleId`,`UserStateId`) values (1,'jingjing','jingjing','Jing Jing','GuangZhou','88888888','jingjing@sina.co',1,1),(2,'bobo','123456','张三','北京','010 5555555','bobo3@d.c',1,1),(3,'user','123456','user','asd','11111111111','1@1.c',1,1),(4,'admin','123456','admin','admin','13456','123456@s.c',3,1),(5,'恰嬉猫','070115','qiaximao','上海市华夏路','13774210000','qiximao@163.com',1,1),(6,'王强','991221','wangqiang','北京软件大学','12334567891','wangqiang@163.co',1,1),(7,'申波','shenbo','shenbo','Beijing','010-64324947','shenbo@263.com',1,1),(8,'Hibernate User','123456',NULL,NULL,NULL,NULL,NULL,NULL),(9,'Another Hibernate User','123456',NULL,NULL,NULL,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
