/*
SQLyog Enterprise - MySQL GUI v6.03
Host - 5.5.8 : Database - zxpm
*********************************************************************
Server version : 5.5.8
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

create database if not exists `zxpm`;

USE `zxpm`;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

/*Table structure for table `bid` */

DROP TABLE IF EXISTS `bid`;

CREATE TABLE `bid` (
  `BidId` int(4) NOT NULL AUTO_INCREMENT,
  `GoodsId` int(4) NOT NULL,
  `BuyerId` int(4) NOT NULL,
  `BidTime` datetime NOT NULL,
  `BidPrice` float NOT NULL,
  `BidStatus` int(4) NOT NULL,
  PRIMARY KEY (`BidId`),
  KEY `FK_bid_buyer` (`BuyerId`),
  KEY `FK_bid_goods` (`GoodsId`),
  CONSTRAINT `FK_bid_buyer` FOREIGN KEY (`BuyerId`) REFERENCES `users` (`UserID`),
  CONSTRAINT `FK_bid_goods` FOREIGN KEY (`GoodsId`) REFERENCES `goods` (`GoodsId`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=gb2312;

/*Data for the table `bid` */

insert  into `bid`(`BidId`,`GoodsId`,`BuyerId`,`BidTime`,`BidPrice`,`BidStatus`) values (1,4,2,'2008-07-27 03:59:23',1400,1),(2,4,2,'2008-07-27 07:53:45',1500,1),(3,4,2,'2008-07-27 07:57:59',1600,1),(4,4,2,'2008-07-27 07:59:51',1700,1),(5,4,2,'2008-07-27 08:00:22',1800,1),(6,4,2,'2008-07-27 08:00:32',1800,1),(7,4,2,'2008-07-27 08:12:42',1900,1),(8,3,1,'2008-07-27 08:18:02',1750,1),(9,3,1,'2008-07-27 08:36:31',1840,1),(10,3,1,'2008-07-27 10:34:40',1900,1),(11,3,3,'2008-07-29 08:32:11',1700,1),(12,3,3,'2008-07-29 08:36:02',1701,1),(13,3,3,'2008-07-29 08:38:30',1701,1);

/*Table structure for table `goods` */

DROP TABLE IF EXISTS `goods`;

CREATE TABLE `goods` (
  `GoodsId` int(4) NOT NULL AUTO_INCREMENT,
  `GoodsName` varchar(16) NOT NULL,
  `GoodsPrice` float NOT NULL,
  `GoodsPic` varchar(200) DEFAULT NULL,
  `GoodsDesc` mediumtext,
  `SalerId` int(4) NOT NULL,
  `BuyerId` int(4) NOT NULL,
  `GoodsStatus` int(4) NOT NULL,
  PRIMARY KEY (`GoodsId`),
  KEY `FK_goods_buyer` (`BuyerId`),
  KEY `FK_goods_saler` (`SalerId`),
  CONSTRAINT `FK_goods_buyer` FOREIGN KEY (`BuyerId`) REFERENCES `users` (`UserID`),
  CONSTRAINT `FK_goods_saler` FOREIGN KEY (`SalerId`) REFERENCES `users` (`UserID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=gb2312;

/*Data for the table `goods` */

insert  into `goods`(`GoodsId`,`GoodsName`,`GoodsPrice`,`GoodsPic`,`GoodsDesc`,`SalerId`,`BuyerId`,`GoodsStatus`) values (3,'电冰箱',1500,'pic/bingxiang.gif','制冷效果好，省电',2,2,1),(4,'洗衣机',1200,'pic/water.jpg','清洗干净',3,3,1),(5,'mp3',10,'pic/mp3.jpg','音质完美',1,1,1);

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `UserID` int(4) NOT NULL AUTO_INCREMENT,
  `UserName` varchar(16) NOT NULL,
  `Password` varchar(16) NOT NULL,
  `Telephone` varchar(16) NOT NULL,
  `Address` varchar(16) NOT NULL,
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=gb2312;

/*Data for the table `users` */

insert  into `users`(`UserID`,`UserName`,`Password`,`Telephone`,`Address`) values (1,'aa','aa','aa','aa'),(2,'bb','bb','bb','bb'),(3,'cc','cc','cc','cc');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
