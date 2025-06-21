-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Waktu pembuatan: 18 Jun 2025 pada 09.39
-- Versi server: 8.4.3
-- Versi PHP: 8.3.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dftugas`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `kode` varchar(50) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `stok` int DEFAULT NULL,
  `jenis` varchar(50) DEFAULT NULL,
  `tgl_masuk` date DEFAULT NULL,
  `harga` decimal(15,2) DEFAULT NULL,
  `harga_jual` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`kode`, `nama`, `stok`, `jenis`, `tgl_masuk`, `harga`, `harga_jual`) VALUES
('202401', 'roti coklat', 10, 'kue basah', '2024-01-15', 3.50, 5.00),
('202402', 'bika ambon', 5, 'kue basah', '2024-02-12', 6.00, 8.00),
('202403', 'kue lapis', 7, 'kue basah', '2024-03-10', 4.00, 6.00),
('202404', 'onde-onde', 12, 'kue tradisional', '2024-04-05', 2.50, 4.00),
('202405', 'pastel', 8, 'kue asin', '2024-05-20', 3.00, 5.00),
('202411', 'kue beras', 7, 'kue basah', '2025-06-16', 12.00, 14.00),
('202412', 'keripik kacang', 23, 'keripik', '2025-06-07', 4.00, 8.00),
('202413', 'keripik melinjo', 10, 'keripik', '2023-04-05', 2.00, 3.00),
('202415', 'kue lotus', 20, 'kue basah', '2025-06-18', 26.00, 30.00);

-- --------------------------------------------------------

--
-- Struktur dari tabel `karyawan`
--

CREATE TABLE `karyawan` (
  `id_karyawan` varchar(20) NOT NULL,
  `nama_karyawan` varchar(100) DEFAULT NULL,
  `jabatan` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `tanggal_masuk` date DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data untuk tabel `karyawan`
--

INSERT INTO `karyawan` (`id_karyawan`, `nama_karyawan`, `jabatan`, `tanggal_masuk`, `email`) VALUES
('001', 'ayu', 'Staff', '2023-02-02', 'ayu@gmail.com'),
('002', 'Raka', 'Manager', '2023-03-10', 'raka.manager@example.com'),
('003', 'Santi', 'Supervisor', '2023-04-05', 'santi.spv@example.com'),
('004', 'Budi', 'Staff', '2023-05-01', 'budi.staff@example.com'),
('005', 'Lina', 'Operator', '2023-06-15', 'lina.operator@example.com'),
('006', 'Tono', 'Cleaning Service', '2023-07-20', 'tono.clean@example.com'),
('007', 'Mega', 'Staff', '2023-08-02', 'mega.staff@example.com'),
('008', 'Agus', 'Supervisor', '2023-09-13', 'agus.spv@example.com'),
('009', 'Rini', 'Manager', '2023-10-21', 'rini.manager@example.com'),
('010', 'Dewi', 'Cleaning Service', '2023-11-09', 'dewi.clean@example.com');

-- --------------------------------------------------------

--
-- Struktur dari tabel `laporan_keuangan`
--

CREATE TABLE `laporan_keuangan` (
  `no` int NOT NULL,
  `tanggal` date NOT NULL,
  `kategori` varchar(50) DEFAULT NULL,
  `keterangan` text,
  `pemasukan` decimal(12,2) DEFAULT '0.00',
  `pengeluaran` decimal(12,2) DEFAULT '0.00'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data untuk tabel `laporan_keuangan`
--

INSERT INTO `laporan_keuangan` (`no`, `tanggal`, `kategori`, `keterangan`, `pemasukan`, `pengeluaran`) VALUES
(1, '2025-06-01', 'Penjualan', 'Penjualan kue bolu', 150000.00, 0.00),
(2, '2025-06-01', 'Pembelian Bahan', 'Tepung terigu dan gula pasir', 0.00, 60000.00),
(3, '2025-06-02', 'Penjualan', 'Penjualan roti coklat', 120000.00, 0.00),
(4, '2025-06-02', 'Transportasi', 'Ongkir pengiriman Grab', 0.00, 20000.00),
(5, '2025-06-03', 'Penjualan', 'Penjualan pastel dan onde-onde', 175000.00, 0.00),
(6, '2025-06-03', 'Pembelian Bahan', 'Telur dan margarin', 0.00, 55000.00),
(7, '2025-06-03', 'Listrik', 'Tagihan listrik toko', 0.00, 125000.00),
(8, '2025-06-04', 'Penjualan', 'Pesanan acara ulang tahun', 300000.00, 0.00),
(9, '2025-06-04', 'Promosi', 'Cetak brosur promo', 0.00, 40000.00),
(10, '2025-06-05', 'Penjualan', 'Penjualan bika ambon dan kue lapis', 210000.00, 0.00),
(11, '2025-07-01', 'penjualan', 'penjualan kue bolu', 200000.00, 0.00),
(12, '2025-06-16', 'penjualan', 'penjualan kue', 200000.00, 0.00),
(13, '2025-06-18', 'penjualan', 'penjualan brownies', 100000.00, 0.00);

-- --------------------------------------------------------

--
-- Struktur dari tabel `master_gaji`
--

CREATE TABLE `master_gaji` (
  `id` int NOT NULL,
  `jabatan` varchar(50) NOT NULL,
  `gaji_pokok` decimal(12,2) NOT NULL,
  `tunjangan` decimal(12,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data untuk tabel `master_gaji`
--

INSERT INTO `master_gaji` (`id`, `jabatan`, `gaji_pokok`, `tunjangan`) VALUES
(1, 'Manager', 7000000.00, 1500000.00),
(2, 'Supervisor', 5000000.00, 1000000.00),
(3, 'Staff', 3500000.00, 750000.00),
(4, 'Operator', 3000000.00, 500000.00),
(5, 'Cleaning Service', 2500000.00, 250000.00);

-- --------------------------------------------------------

--
-- Struktur dari tabel `penggajian`
--

CREATE TABLE `penggajian` (
  `id_karyawan` varchar(10) DEFAULT NULL,
  `jabatan` varchar(50) DEFAULT NULL,
  `total_gaji` int DEFAULT NULL,
  `bulan` varchar(10) DEFAULT NULL,
  `tahun` varchar(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data untuk tabel `penggajian`
--

INSERT INTO `penggajian` (`id_karyawan`, `jabatan`, `total_gaji`, `bulan`, `tahun`) VALUES
('001', 'Staff', 4250000, 'januari', '2025'),
('002', 'Manager', 8500000, 'januari', '2025'),
('003', 'Supervisor', 6000000, 'januari', '2025'),
('004', 'Staff', 4250000, 'januari', '2025'),
('005', 'Operator', 3500000, 'januari', '2025'),
('006', 'Cleaning Service', 2760000, 'januari', '2025'),
('007', 'Staff', 4250000, 'januari', '2025'),
('008', 'Supervisor', 6000000, 'januari', '2025'),
('009', 'Manager', 8500000, 'januari', '2025'),
('010', 'Cleaning Service', 2760000, 'januari', '2025'),
('001', 'Staff', 4250000, 'februari', '2025'),
('002', 'Manager', 8500000, 'februari', '2025'),
('003', 'Supervisor', 6000000, 'februari', '2025'),
('004', 'Staff', 4250000, 'februari', '2025'),
('005', 'Operator', 3500000, 'februari', '2025'),
('006', 'Cleaning Service', 2760000, 'februari', '2025'),
('007', 'Staff', 4250000, 'februari', '2025'),
('008', 'Supervisor', 6000000, 'februari', '2025'),
('009', 'Manager', 8500000, 'februari', '2025'),
('010', 'Cleaning Service', 2760000, 'februari', '2025'),
('001', 'Staff', 4250000, 'maret', '2025'),
('002', 'Manager', 8500000, 'maret', '2025'),
('003', 'Supervisor', 6000000, 'maret', '2025'),
('004', 'Staff', 4250000, 'maret', '2025'),
('005', 'Operator', 3500000, 'maret', '2025'),
('006', 'Cleaning Service', 2750000, 'maret', '2025'),
('007', 'Staff', 4250000, 'maret', '2025'),
('008', 'Supervisor', 6000000, 'maret', '2025'),
('009', 'Manager', 8500000, 'maret', '2025'),
('010', 'Cleaning Service', 2750000, 'maret', '2025');

-- --------------------------------------------------------

--
-- Struktur dari tabel `perubahan_harga`
--

CREATE TABLE `perubahan_harga` (
  `id` int NOT NULL,
  `kode` varchar(10) DEFAULT NULL,
  `harga_lama` int DEFAULT NULL,
  `harga_baru` int DEFAULT NULL,
  `tanggal_perubahan` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data untuk tabel `perubahan_harga`
--

INSERT INTO `perubahan_harga` (`id`, `kode`, `harga_lama`, `harga_baru`, `tanggal_perubahan`) VALUES
(2, '202403', 4, 5, '2024-06-10'),
(3, '202405', 3, 3, '2024-06-12'),
(4, '202401', 5, 6, '2025-06-16');

-- --------------------------------------------------------

--
-- Struktur dari tabel `stok_opname`
--

CREATE TABLE `stok_opname` (
  `id` int NOT NULL,
  `kode` varchar(20) DEFAULT NULL,
  `stok_awal` int DEFAULT NULL,
  `stok_gudang` int DEFAULT NULL,
  `tanggal` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data untuk tabel `stok_opname`
--

INSERT INTO `stok_opname` (`id`, `kode`, `stok_awal`, `stok_gudang`, `tanggal`) VALUES
(1, '202401', 10, 5, '2023-04-15'),
(2, '202402', 5, 1, '2023-05-12'),
(3, '202403', 7, 5, '2025-04-05'),
(4, '202404', 12, 6, '2023-04-05'),
(5, '202405', 8, 3, '2023-04-05'),
(6, '202411', 7, 6, '2023-04-05'),
(8, '202412', 23, 20, '2023-04-05'),
(9, '202413', 10, 10, '2023-04-05'),
(10, '202415', 20, 15, '2023-04-05');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kode`);

--
-- Indeks untuk tabel `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`id_karyawan`);

--
-- Indeks untuk tabel `laporan_keuangan`
--
ALTER TABLE `laporan_keuangan`
  ADD PRIMARY KEY (`no`);

--
-- Indeks untuk tabel `master_gaji`
--
ALTER TABLE `master_gaji`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `jabatan` (`jabatan`);

--
-- Indeks untuk tabel `perubahan_harga`
--
ALTER TABLE `perubahan_harga`
  ADD PRIMARY KEY (`id`),
  ADD KEY `kode` (`kode`);

--
-- Indeks untuk tabel `stok_opname`
--
ALTER TABLE `stok_opname`
  ADD PRIMARY KEY (`id`),
  ADD KEY `kode` (`kode`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `laporan_keuangan`
--
ALTER TABLE `laporan_keuangan`
  MODIFY `no` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT untuk tabel `master_gaji`
--
ALTER TABLE `master_gaji`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT untuk tabel `perubahan_harga`
--
ALTER TABLE `perubahan_harga`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT untuk tabel `stok_opname`
--
ALTER TABLE `stok_opname`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `perubahan_harga`
--
ALTER TABLE `perubahan_harga`
  ADD CONSTRAINT `perubahan_harga_ibfk_1` FOREIGN KEY (`kode`) REFERENCES `barang` (`kode`);

--
-- Ketidakleluasaan untuk tabel `stok_opname`
--
ALTER TABLE `stok_opname`
  ADD CONSTRAINT `stok_opname_ibfk_1` FOREIGN KEY (`kode`) REFERENCES `barang` (`kode`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
