-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 16, 2018 at 04:03 PM
-- Server version: 5.7.9
-- PHP Version: 5.6.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ora_banner`
--

-- --------------------------------------------------------

--
-- Table structure for table `banner_log`
--

DROP TABLE IF EXISTS `banner_log`;
CREATE TABLE IF NOT EXISTS `banner_log` (
  `banner_log_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_by` bigint(20) DEFAULT NULL,
  `created_date` varchar(255) DEFAULT NULL,
  `modified_by` bigint(20) DEFAULT NULL,
  `modified_date` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `end_datetime` varchar(255) DEFAULT NULL,
  `start_datetime` varchar(255) DEFAULT NULL,
  `banner_id` bigint(20) NOT NULL,
  PRIMARY KEY (`banner_log_id`),
  KEY `FK8imov4x2f3lrctwfygmaff2el` (`banner_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `master_banner`
--

DROP TABLE IF EXISTS `master_banner`;
CREATE TABLE IF NOT EXISTS `master_banner` (
  `banner_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_by` bigint(20) DEFAULT NULL,
  `created_date` varchar(255) DEFAULT NULL,
  `modified_by` bigint(20) DEFAULT NULL,
  `modified_date` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `banner_description` varchar(255) DEFAULT NULL,
  `banner_img_url` varchar(255) DEFAULT NULL,
  `banner_link` varchar(255) DEFAULT NULL,
  `banner_category_id` bigint(20) NOT NULL,
  PRIMARY KEY (`banner_id`),
  KEY `FK7udqjpd7g1myr1fxrewtfw3yc` (`banner_category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `master_banner`
--

INSERT INTO `master_banner` (`banner_id`, `created_by`, `created_date`, `modified_by`, `modified_date`, `status`, `banner_description`, `banner_img_url`, `banner_link`, `banner_category_id`) VALUES
(1, 1, '2018-12-16 20:45:19', NULL, NULL, 1, 'Offer', 'www.google.com', 'www.google.com', 1),
(2, 1, '2018-12-16 20:45:19', NULL, NULL, 1, 'Couple Friendly', 'www.facebook.com', 'www.facebook.com', 2);

-- --------------------------------------------------------

--
-- Table structure for table `master_banner_category`
--

DROP TABLE IF EXISTS `master_banner_category`;
CREATE TABLE IF NOT EXISTS `master_banner_category` (
  `banner_category_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_by` bigint(20) DEFAULT NULL,
  `created_date` varchar(255) DEFAULT NULL,
  `modified_by` bigint(20) DEFAULT NULL,
  `modified_date` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `banner_type_id` bigint(20) NOT NULL,
  PRIMARY KEY (`banner_category_id`),
  KEY `FKn10ni8smy2hb65yv772lqwlws` (`banner_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `master_banner_category`
--

INSERT INTO `master_banner_category` (`banner_category_id`, `created_by`, `created_date`, `modified_by`, `modified_date`, `status`, `name`, `banner_type_id`) VALUES
(1, 1, '2018-12-16 20:45:19', NULL, NULL, 1, 'Offer', 2),
(2, 1, '2018-12-16 20:45:19', NULL, NULL, 1, 'Couple Friendly', 1),
(3, 1, '2018-12-16 20:45:19', NULL, NULL, 1, 'Pet Friendly', 1);

-- --------------------------------------------------------

--
-- Table structure for table `master_banner_type`
--

DROP TABLE IF EXISTS `master_banner_type`;
CREATE TABLE IF NOT EXISTS `master_banner_type` (
  `banner_type_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_by` bigint(20) DEFAULT NULL,
  `created_date` varchar(255) DEFAULT NULL,
  `modified_by` bigint(20) DEFAULT NULL,
  `modified_date` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`banner_type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `master_banner_type`
--

INSERT INTO `master_banner_type` (`banner_type_id`, `created_by`, `created_date`, `modified_by`, `modified_date`, `status`, `name`) VALUES
(1, 1, '2018-12-16 20:45:19', NULL, NULL, 1, 'Link'),
(2, 1, '2018-12-16 20:45:19', NULL, NULL, 1, 'Non Link');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `banner_log`
--
ALTER TABLE `banner_log`
  ADD CONSTRAINT `FK8imov4x2f3lrctwfygmaff2el` FOREIGN KEY (`banner_id`) REFERENCES `master_banner` (`banner_id`);

--
-- Constraints for table `master_banner`
--
ALTER TABLE `master_banner`
  ADD CONSTRAINT `FK7udqjpd7g1myr1fxrewtfw3yc` FOREIGN KEY (`banner_category_id`) REFERENCES `master_banner_category` (`banner_category_id`);

--
-- Constraints for table `master_banner_category`
--
ALTER TABLE `master_banner_category`
  ADD CONSTRAINT `FKn10ni8smy2hb65yv772lqwlws` FOREIGN KEY (`banner_type_id`) REFERENCES `master_banner_type` (`banner_type_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
