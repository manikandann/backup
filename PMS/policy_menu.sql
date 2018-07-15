-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Server version: 5.6.26
-- PHP Version: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `test`
--

-- --------------------------------------------------------

--
-- Table structure for table `item_menu`
--

CREATE TABLE IF NOT EXISTS `item_menu` (
  `ITEM_ID` int(10) NOT NULL,
  `ITEM_NAME` varchar(25) NOT NULL,
  `ITEM_PRICE` float NOT NULL,
  `Time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `status` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item_menu`
--

INSERT INTO `item_menu` (`ITEM_ID`, `ITEM_NAME`, `ITEM_PRICE`, `Time`, `status`) VALUES
(101, 'Jeevan One', 1120, '2018-05-06 06:35:05', 'available'),
(102, 'Life Gold', 2115, '2018-06-15 12:36:53', 'notavailable'),
(103, 'Jeevan Plus', 2244, '2018-06-17 06:38:28', 'notavailable '),
(104, 'Life pure', 700, '2018-06-20 05:16:38', 'available '),
(105, 'Jeevan Gold', 500, '2018-06-20 10:16:50', 'available '),
(106, 'Life Plus', 250, '2018-06-20 10:17:04', 'available '),
(107, 'Jeeven Thara', 555, '2018-06-20 10:17:14', 'notavailable '),
(108, 'premium', 200, '2018-06-21 11:41:40', 'available ')


--
-- Indexes for dumped tables
--

--
-- Indexes for table `item_menu`
--
ALTER TABLE `item_menu`
  ADD PRIMARY KEY (`ITEM_ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
