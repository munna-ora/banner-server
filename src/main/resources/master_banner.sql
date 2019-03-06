-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 05, 2019 at 12:21 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
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
-- Table structure for table `master_banner`
--

CREATE TABLE `master_banner` (
  `banner_id` bigint(20) NOT NULL,
  `created_by` bigint(20) DEFAULT NULL,
  `created_date` varchar(255) DEFAULT NULL,
  `modified_by` bigint(20) DEFAULT NULL,
  `modified_date` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `banner_description` varchar(255) DEFAULT NULL,
  `banner_img_url` varchar(255) DEFAULT NULL,
  `banner_link` varchar(255) DEFAULT NULL,
  `banner_category_id` bigint(20) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `sub_title` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `master_banner`
--

INSERT INTO `master_banner` (`banner_id`, `created_by`, `created_date`, `modified_by`, `modified_date`, `status`, `banner_description`, `banner_img_url`, `banner_link`, `banner_category_id`, `title`, `sub_title`) VALUES
(1, 1, '2018-12-19 13:45:25', NULL, NULL, 1, 'December Offer', 'www.google.com', 'www.google.com', 1, 'HI i am title 1', 'HI i am sub title 1'),
(2, 1, '2018-12-19 13:45:26', NULL, NULL, 1, 'January Offer', 'www.google.com', 'www.google.com', 1, 'HI i am title 1', NULL),
(3, 1, '2018-12-19 13:45:27', NULL, NULL, 1, 'Banner 1', 'www.google.com', '', 4, NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `master_banner`
--
ALTER TABLE `master_banner`
  ADD PRIMARY KEY (`banner_id`),
  ADD KEY `FK7udqjpd7g1myr1fxrewtfw3yc` (`banner_category_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `master_banner`
--
ALTER TABLE `master_banner`
  MODIFY `banner_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `master_banner`
--
ALTER TABLE `master_banner`
  ADD CONSTRAINT `FK7udqjpd7g1myr1fxrewtfw3yc` FOREIGN KEY (`banner_category_id`) REFERENCES `master_banner_category` (`banner_category_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
