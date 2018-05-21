-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 17, 2018 at 06:02 PM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `daftar`
--

CREATE TABLE `daftar` (
  `nama_lengkap` varchar(20) NOT NULL,
  `username` varchar(20) NOT NULL,
  `pw` varchar(25) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `hakakses` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `daftar`
--

INSERT INTO `daftar` (`nama_lengkap`, `username`, `pw`, `alamat`, `hakakses`) VALUES
('anggreiniintan', 'aang', 'aangadmin', 'kosan pagar putih nomor 2', 'admin'),
('admin', 'admin', 'admin', 'admin', 'admin'),
('dinda', 'dinda', '1234', 'hasan 4', 'kasir'),
('fristyriani', 'frozen', 'frozenkasir', 'kosan pak irwan no 1', 'kasir'),
('annisa gita', 'gita', 'gitaadmin', 'kosan pak irwan no 2', 'admin'),
('kasir', 'kasir', 'kasir', 'kasir', 'kasir');

-- --------------------------------------------------------

--
-- Table structure for table `dataobat`
--

CREATE TABLE `dataobat` (
  `id` varchar(5) NOT NULL,
  `nama_obat` varchar(35) NOT NULL,
  `cara_penggunaan` varchar(300) NOT NULL,
  `deskripsi` varchar(300) NOT NULL,
  `efek` varchar(200) NOT NULL,
  `harga` int(10) NOT NULL,
  `stok` int(11) NOT NULL,
  `nama` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dataobat`
--

INSERT INTO `dataobat` (`id`, `nama_obat`, `cara_penggunaan`, `deskripsi`, `efek`, `harga`, `stok`, `nama`) VALUES
('10001', 'Hydrocortison 2,5 %', 'Dioleskan ke bagian kulit yang gatal', 'kemasan tube berwarna biru kombinasi putih, 50 gram', 'jika terlalu banyak bisa menyebabkan  luka terbakar', 25000, 24, 'Alergi gatal'),
('11001', 'Protopic oinment 0.03%', 'oleskan pada area kulit yang gatal', 'tube berwarna putih, 30 gram', 'jangan digunakan bersamaan dengan obat lainnya', 23500, 36, 'Alergi gatal'),
('12001', 'kapsida', 'minum 2x sehari,setelah makan', 'kemasan dominan kuning, dengan kombinasi biru, berisi botol bening dengan kapsul 15 buah', 'mengurangi nafsu makan', 35500, 12, 'Alergi gatal'),
('13001', 'miconazole 2%', 'dioleskan pada bagian yang gatal', 'tube kecil ukuran 10 gram, berwarna putih', 'jangan digunakan bersamaan dengan obat lain.', 33000, 6, 'Alergi gatal'),
('14001', 'alloris', 'diminum 2x sehari, setelah makan', 'kemasan lempeng berwarana kuning kombinasi silver isi 5 kaplet', 'menyebabkan kantuk', 15500, 10, 'Alergi gatal'),
('15001', 'Ketoconazole cream 2%', 'Dioleskan ke bagian kulit yang gatal', 'kemasan tube berwarna putih kombinasi merah, 45 gram', 'jika terlalu banyak bisa menyebabkan  luka terbakar', 25000, 16, 'Alergi gatal'),
('20002', 'sangobion', 'minum 1x sehari', 'lempeng almunium berisi 10 kapsul bercangkang lunak, warna kemasan dominan merah dengan kombinasi silver', '-', 12500, 10, 'Anemia'),
('21002', 'feroglobion', 'minum 2x sehari', 'botol coklat dengan kemasan kombinasi merah putih, dengan tutup putih, 50 ml', '-', 15500, 15, 'Anemia'),
('22002', 'sakatonik liver', 'minum 3x sehari', 'botol coklat dengan kemasan kombinasi merah putih, dengan tutup keemasan, 100 ml', '-', 17500, 25, 'Anemia'),
('23002', 'novabion', 'minum 2x sehari', 'lempeng almunium berisi 10 kapsul bercangkang lunak, warna kemasan dominan silver dengan kombinasi merah', '-', 11500, 26, 'Anemia'),
('24002', 'hemapod', '1x sehari', 'suntikan kecil, warna kemasan dominan putih dengan kombinasi merah', '-', 18500, 6, 'Anemia'),
('25002', 'neurosanbe', 'minum 1x sehari', 'kemasan kaplet almunium , brwarna kuning kombinasi putih, isi 8 kaplet', '-', 18500, 11, 'Anemia'),
('30003', 'OBH Original', 'minum 3x sehari, setelah makan', 'botol berwarna coklat tua warna kemasan hijau,125 ml', 'menimbulkan kantuk', 12500, 15, 'Batuk'),
('31003', 'WOODS', 'minum 2x sehari', 'botol berwarna coklat warna kemasan berwarna kuning kombinasi biru,100 ml', 'menimbulkan kantuk', 15500, 24, 'Batuk'),
('32003', 'OBH combi', 'minum 2x sehari,setelah makan', 'botol berwarna coklat warna kemasan berwarna hijau kombinasi jingga,100 ml', 'menimbulkan kantuk', 13500, 36, 'Batuk'),
('33003', 'actifed', 'minum 3x sehari,setelah makan', 'botol berwarna putih transaparan, dengan warna isi merah muda warna kemasan berwarna merah,60 ml', 'menimbulkan kantuk', 10500, 20, 'Batuk'),
('34003', 'herba kof', 'minum 1x sehari,sebelum tidur', 'botol berwarna coklat, dengan warna kemasan berwarna kuning, 100 ml', 'menimbulkan kantuk', 16500, 30, 'Batuk'),
('35003', 'vicks', 'minum 3x sehari,sebelum makan', 'botol berwarna coklat, dengan warna kemasan berwarna biru, 100 ml', 'menimbulkan kantuk', 14000, 24, 'Batuk'),
('36003', 'bisolvon', 'minum 2x sehari,setelah makan', 'botol berwarna coklat, dengan warna kemasan berwarna kuning kombinasi merah, 100 ml', 'menimbulkan kantuk', 18000, 21, 'Batuk'),
('40004', 'combatrin dewasa', 'minum 2 kapsu untuk sekali pemakaian', 'kemasan biru berisi dua kapsul', 'bisa menyebabkan ganguan pencernaan', 13500, 5, 'Cacingan'),
('41004', 'vermok obat cacingan', 'diminum stelah makan, 1x sehari', 'kemasan berwarna putih kombinsai kuning, berisi 4 kapsul', 'menyebabkan ganguan pencernaan', 13000, 10, 'Cacingan'),
('42004', 'konvermex 125', 'diminum satu sendok teh sebelum makan', 'botol kecil berwarna jingga, 25 ml', 'mengurangi nafsu makan', 25000, 12, 'Cacingan'),
('43004', 'albendazole', 'diminum 2x sehari sebelum makan', 'lempengan berwarna silver, berisik 10 kaplet', 'ganguan pencernaan ', 8500, 12, 'Cacingan'),
('44004', 'fermino', 'diminum 2x sehari sebelum makan', 'botol putih berlabel jingga berisi 25 kapsul', 'ganguan nafsu makan', 34500, 14, 'Cacingan'),
('50005', 'metformin 500mg', 'diminum 3x sehari setelah makan', 'kemasan lempeng kaplet, berisi 14 kaplet', 'mengurangi nafsu makan', 18500, 13, 'Diabetes'),
('51005', 'glucovance', 'diminum stelah makan, 2x sehari', 'lempengan berarna silver berisi 10 kaplet', 'mengurangi nafsu makan', 23500, 33, 'Diabetes'),
('52005', 'jamsi (jamu diabetasi)', 'dicampurkan dengan air, diminum 2x sehari ', 'boto kaca kecoklatan dengan kemasan putih kombinasi biru, 75 ml', 'menimbulkan kantuk', 45000, 7, 'Diabetes'),
('53005', 'metformin 500mg', 'diminum stelah makan, 2x sehari', 'kemasan  lempeng berwarna putih berisi 6 kaplet', 'mengurangi nafsu makan', 12500, 24, 'Diabetes'),
('54005', 'acarbose', 'diminum stelah makan, 2x sehari', 'lempeng almunium berisi 20 kaplet bulat berwarna putih', 'mengurangi nafsu makan', 85500, 15, 'Diabetes'),
('55005', 'renabetic glibenclamide 5 mg', 'diminum 2x sehari ', 'kemasan kaplet almunium berwarna putih kombinasi merah, 10 kaplet', '-', 14500, 12, 'Diabetes'),
('60006', 'rhinos sr', 'diminum stelah makan, 2x sehari', 'kemasan lempeng dengan berisi kapsul bening yang berisi butiran obatnya, 10 kapsul', 'menimbulkan kantuk', 45000, 20, 'Diabetes'),
('61006', 'fluba (obat flu anak)', 'diminum stelah makan, 3x sehari', 'kemasan botol coklat dengan label bergambar anak warna dominasi biru, 50 ml', 'menimbulkan kantuk\r\nmenambah nafsu makan', 18500, 8, 'Flu'),
('62006', 'nelco special ', 'diminum stelah makan, 3x sehari', 'botol kecoklatan dengan kemasan kombinasi jingga dan hijau, 100 ml', 'menimbulkan kantuk', 25000, 13, 'Flu'),
('63006', 'procold', 'diminum stelah makan, 2x sehari', 'lempeng berisi 6 buah, kemasan berwarna ungu kombinasi', 'menimbulkan rasa kantuk', 6500, 24, 'Flu'),
('64006', 'siladex biru', 'diminum stelah makan, 2x sehari', 'botol kecoklatan dengan kemasan biru, 125 ml', '-', 18500, 25, 'Flu'),
('65006', 'tremenza', 'diminum stelah makan, 2x sehari', 'kemasan kaplet almunium, berwarna putih kombinasi hijau toska isi 10 kaplet', '-', 16500, 20, 'Flu'),
('70007', 'mylanta cair', 'diminum stelah makan, 2x sehari', 'kemasan botol biru kecil berwarna hijau kemasan 60 ml', 'menyebabkan mual', 13000, 32, 'Flu'),
('71007', 'polysilane', 'diminum stelah makan, saat terasa perih', 'botol berwarna putih kombinasi, 75 ml', 'menyebabkan mual dan pusing', 43000, 15, 'Flu'),
('72007', 'promag', 'diminum stelah makan, 2x sehari', 'kemasan lempeng, berisi 10 kaplet, berwarna hijau ', 'menyebabkan mual', 11000, 35, 'maag'),
('73007', 'mylanta kaplet', 'diminum stelah makan, 2x sehari', 'kemasan lempeng, berisi 10 kaplet', 'menyebabkan mual', 12000, 13, 'maag'),
('74007', 'polysilane kaplet', 'diminum stelah makan, saat terasa perih', 'lempeng berwarna putih, berisi 10 kaplet, kemasan biru muda kombinasi putih', '-', 33000, 33, 'maag'),
('75007', 'antasida doen (tablet kunyah)', 'diminum stelah makan, saat terasa perih', 'lempeng berwarna putih, berisi 10 kaplet, kemasan biru muda kombinasi putih', 'mengurangi nafsu makan', 56000, 14, 'maag');

-- --------------------------------------------------------

--
-- Table structure for table `kategori`
--

CREATE TABLE `kategori` (
  `id_kategori` int(10) NOT NULL,
  `nama` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kategori`
--

INSERT INTO `kategori` (`id_kategori`, `nama`) VALUES
(1, 'Alergi gatal'),
(2, 'Anemia'),
(3, 'Batuk'),
(4, 'Cacingan'),
(5, 'Diabetes'),
(6, 'Flu'),
(7, 'Maag'),
(8, 'Sakit Kepala');

-- --------------------------------------------------------

--
-- Table structure for table `pembukuan`
--

CREATE TABLE `pembukuan` (
  `id` varchar(5) NOT NULL,
  `total_harga` char(10) NOT NULL,
  `tanggal_keluar` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pembukuan`
--

INSERT INTO `pembukuan` (`id`, `total_harga`, `tanggal_keluar`) VALUES
('1', '2000', '2018-05-08'),
('1', '2000', '2018-05-08'),
('13001', '33000', '2018-05-08'),
('14001', '15500', '2018-05-08'),
('10001', '25000', '2018-05-09'),
('11001', '23500', '2018-05-09'),
('13001', '33000', '2018-05-09'),
('10000', '75000', '2018-05-09'),
('11001', '23500', '2018-05-09'),
('13001', '33000', '2018-05-09'),
('14001', '15500', '2018-05-09'),
('21002', '15500', '2018-05-09'),
('10001', '25000', '2018-05-09'),
('13001', '33000', '2018-05-09'),
('14001', '15500', '2018-05-09'),
('10000', '75000', '2018-05-09'),
('10001', '25000', '2018-05-09'),
('11001', '23500', '2018-05-09'),
('10000', '75000', '2018-05-09'),
('10001', '25000', '2018-05-09'),
('10001', '25000', '2018-05-09'),
('10000', '75000', '2018-05-09'),
('50005', '18500', '2018-05-09'),
('52005', '45000', '2018-05-09'),
('61006', '18500', '2018-05-09'),
('40004', '13500', '2018-05-09'),
('10000', '75000', '2018-05-09'),
('10001', '25000', '2018-05-09'),
('10000', '75000', '2018-05-09'),
('10001', '25000', '2018-05-09'),
('10000', '75000', '2018-05-09'),
('10001', '25000', '2018-05-09'),
('13001', '33000', '2018-05-09'),
('14001', '15500', '2018-05-09'),
('10001', '25000', '2018-05-09'),
('10000', '75000', '2018-05-09'),
('10000', '75000', '2018-05-09'),
('10001', '25000', '2018-05-09'),
('10000', '75000', '2018-05-09'),
('10001', '25000', '2018-05-09'),
('10000', '75000', '2018-05-09'),
('10001', '25000', '2018-05-09'),
('10000', '75000', '2018-05-09'),
('11001', '23500', '2018-05-09'),
('10000', '75000', '2018-05-09'),
('10001', '25000', '2018-05-09'),
('10000', '75000', '2018-05-09'),
('12001', '35500', '2018-05-10'),
('13001', '33000', '2018-05-10'),
('11001', '23500', '2018-05-10'),
('13001', '33000', '2018-05-10'),
('20002', '12500', '2018-05-10'),
('10001', '25000', '2018-05-10'),
('12001', '35500', '2018-05-10'),
('15001', '25000', '2018-05-10'),
('12001', '35500', '2018-05-10'),
('14001', '15500', '2018-05-10'),
('22002', '17500', '2018-05-10'),
('16001', '27500', '2018-05-10'),
('21002', '15500', '2018-05-10'),
('15001', '25000', '2018-05-10'),
('21002', '15500', '2018-05-10'),
('16001', '27500', '2018-05-10'),
('23002', '11500', '2018-05-10'),
('10001', '25000', '2018-05-10'),
('11001', '23500', '2018-05-10'),
('10001', '25000', '2018-05-10'),
('11001', '23500', '2018-05-10'),
('10001', '25000', '2018-05-10'),
('11001', '23500', '2018-05-10'),
('20002', '12500', '2018-05-12'),
('13001', '33000', '2018-05-12'),
('10001', '25000', '2018-05-12'),
('13001', '33000', '2018-05-12'),
('20002', '12500', '2018-05-15'),
('25002', '18500', '2018-05-15'),
('22002', '17500', '2018-05-15'),
('11001', '23500', '2018-05-16'),
('14001', '15500', '2018-05-16'),
('12001', '35500', '2018-05-17'),
('21002', '15500', '2018-05-17'),
('24002', '18500', '2018-05-17'),
('12001', '35500', '2018-05-17'),
('15001', '25000', '2018-05-17'),
('23002', '11500', '2018-05-17');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `daftar`
--
ALTER TABLE `daftar`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `dataobat`
--
ALTER TABLE `dataobat`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`nama`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
