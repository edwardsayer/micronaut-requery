CREATE DATABASE IF NOT EXISTS `fusionspace` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `fusionspace`;


CREATE TABLE IF NOT EXISTS `page` (
  `postid` bigint(20) NOT NULL AUTO_INCREMENT,
  `typeid` bigint(20) DEFAULT NULL,
  `memberid` char(32) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `rootid` bigint(20) DEFAULT NULL,
  `parentid` bigint(20) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `sdate` datetime DEFAULT NULL,
  `suser` varchar(255) DEFAULT NULL,
  `xdate` datetime DEFAULT NULL,
  `xuser` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`postid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;


INSERT INTO `page` (`postid`, `typeid`, `memberid`, `title`, `content`, `rootid`, `parentid`, `status`, `sdate`, `suser`, `xdate`, `xuser`) VALUES
    (1, NULL, 'nobody', 'Nothing to say!', 'Go go go!', NULL, NULL, NULL, NULL, 'yesy', NULL, 'taste');