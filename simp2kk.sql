-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 27, 2021 at 03:00 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `simp2kk`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(355) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin'),
(2, 'petugas1', 'simp2kk');

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
--

CREATE TABLE `pasien` (
  `nomor` int(11) NOT NULL,
  `nama_pasien` varchar(30) NOT NULL,
  `jenis_kelamin` varchar(30) NOT NULL,
  `goldar` varchar(30) NOT NULL,
  `usia` int(11) NOT NULL,
  `tanggal_masuk` varchar(25) NOT NULL,
  `keluhan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pasien`
--

INSERT INTO `pasien` (`nomor`, `nama_pasien`, `jenis_kelamin`, `goldar`, `usia`, `tanggal_masuk`, `keluhan`) VALUES
(0, '-', '-', '-', 0, '-', '-'),
(1, 'Fahrul Fy', 'Laki - Laki', 'AB', 24, '29 01 2002', 'sakit kepala'),
(8, 'Abdul Chandra', 'Laki - Laki', 'B', 42, '12 03 2021', 'Sakit pinggang'),
(11, 'Reza Gunawan', 'Laki - Laki', 'B', 20, '27 06 2020', 'Demam'),
(12, 'Dewi Putri', 'Perempuan', 'AB', 22, '26 06 2021', 'Sakit Telinga'),
(13, 'Rudi Gunawan', 'Laki - Laki', 'AB', 20, '27 06 2020', 'Sakit Mata'),
(27, 'Abimanyu', 'Laki - Laki', 'A', 15, '02 03 2012', 'Pusing'),
(30, 'Fauzi', 'Perempuan', 'B', 32, '23 06 2020', 'sakit');

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE `petugas` (
  `nomor_petugas` int(255) NOT NULL,
  `nama_petugas` varchar(30) NOT NULL,
  `jk_petugas` varchar(30) NOT NULL,
  `bidang_petugas` varchar(30) NOT NULL,
  `ruang_petugas` varchar(30) NOT NULL,
  `jadwal_petugas` varchar(30) NOT NULL,
  `jam_kerja` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `petugas`
--

INSERT INTO `petugas` (`nomor_petugas`, `nama_petugas`, `jk_petugas`, `bidang_petugas`, `ruang_petugas`, `jadwal_petugas`, `jam_kerja`) VALUES
(0, '-', '-', '-', '-', '-', '-'),
(1, 'Bernard Mahfoud', 'Laki - Laki', 'Petugas Keamanan', 'Resepsionis', 'Weekday', 'Full Time'),
(2, 'Abimanyu', 'Laki - Laki', 'Dokter', 'Ruang Melati', 'Selasa', 'Shift Siang'),
(3, 'Farah Sofi', 'Perempuan', 'Dokter', 'Ruang Mawar', 'Senin', 'Shift Siang'),
(4, 'Farhan Rasyids', 'Laki - Laki', 'Petugas Keamanan', 'Ruang Anggrek', 'Rabu', 'Shift Malam'),
(5, 'Endro Halilintar', 'Laki - Laki', 'Teknisi', 'Ruang Mawar', 'Kamis', 'Shift Sore'),
(6, 'Kasandra', 'Perempuan', 'Perawat', 'Ruang Mawar', 'Jumat', 'Full Time'),
(7, 'Fozy Black', 'Laki - Laki', 'Petugas Keamanan', 'Resepsionis', 'Sabtu', 'Shift Sore'),
(8, 'Miranda', 'Perempuan', 'Perawat', 'Ruang Anggrek', 'Minggu', 'Shift Sore'),
(9, 'Zakaria Anwar', 'Laki - Laki', 'Dokter', 'Ruang Anggrek', 'Setiap Hari', 'Shift Siang'),
(10, 'Lilith', 'Perempuan', 'Dokter', 'Ruang Melati', 'Weekend', 'Shift Malam');

-- --------------------------------------------------------

--
-- Table structure for table `rekap`
--

CREATE TABLE `rekap` (
  `nomor_rekap` int(11) NOT NULL,
  `nama_petugas` varchar(30) NOT NULL,
  `nama_pasien` varchar(30) NOT NULL,
  `kegiatan` varchar(50) NOT NULL,
  `tanggal_rekap` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rekap`
--

INSERT INTO `rekap` (`nomor_rekap`, `nama_petugas`, `nama_pasien`, `kegiatan`, `tanggal_rekap`) VALUES
(1, 'Bernard Mahfoudz', 'Reza Gunawan', 'Pemeriksaan berkala', '13-07-2012'),
(2, 'Farhan Rasyid', 'Abdul Chandra', 'Pemeriksaan berkala', '23 oktober 2014'),
(3, 'Farhan Rasyid', 'Dewi Putri', 'Pemeriksaan berkala', '19-09-2012'),
(5, 'Abimanyu', 'Dewi Putri', '-', '-');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`nomor`);

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`nomor_petugas`);

--
-- Indexes for table `rekap`
--
ALTER TABLE `rekap`
  ADD PRIMARY KEY (`nomor_rekap`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `pasien`
--
ALTER TABLE `pasien`
  MODIFY `nomor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=58;

--
-- AUTO_INCREMENT for table `petugas`
--
ALTER TABLE `petugas`
  MODIFY `nomor_petugas` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
