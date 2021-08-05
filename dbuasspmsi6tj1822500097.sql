-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 05 Agu 2021 pada 16.43
-- Versi server: 10.4.18-MariaDB
-- Versi PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbuasspmsi6tj1822500097`
--
CREATE DATABASE IF NOT EXISTS `dbuasspmsi6tj1822500097` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `dbuasspmsi6tj1822500097`;

-- --------------------------------------------------------

--
-- Struktur dari tabel `pasiencovid`
--

CREATE TABLE `pasiencovid` (
  `NIK` varchar(10) NOT NULL,
  `Nama` varchar(20) NOT NULL,
  `Jk` varchar(15) NOT NULL,
  `GolDar` varchar(2) NOT NULL,
  `Kecamatan` varchar(20) NOT NULL,
  `Kelurahan` varchar(20) NOT NULL,
  `Gejala` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `pasiencovid`
--
ALTER TABLE `pasiencovid`
  ADD PRIMARY KEY (`NIK`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
