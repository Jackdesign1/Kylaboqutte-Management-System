CREATE DATABASE IF NOT EXISTS `db_inventory_new`;


USE `db_inventory_new`;

/*Table structure for table `distributor` */

DROP TABLE IF EXISTS `distributor`;

CREATE TABLE `distributor` (
  `id_distributor` CHAR(10) NOT NULL,
  `nama_distributor` VARCHAR(30) NOT NULL,
  `telp_distributor` VARCHAR(13) NOT NULL,
  `alamat_distributor` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id_distributor`)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

/*Table structure for table `jenis_barang` */

DROP TABLE IF EXISTS `jenis_barang`;

CREATE TABLE `jenis_barang` (
  `kode_jenis` CHAR(5) NOT NULL,
  `nama_jenis` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`kode_jenis`)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

/*Table structure for table `pengguna` */

DROP TABLE IF EXISTS `pengguna`;

CREATE TABLE `pengguna` (
  `id_pengguna` CHAR(10) NOT NULL,
  `nama_pengguna` VARCHAR(30) NOT NULL,
  `username` VARCHAR(30) NOT NULL,
  `password` VARCHAR(100) NOT NULL,
  `telp_pengguna` VARCHAR(13) NOT NULL,
  `alamat_pengguna` VARCHAR(100) NOT NULL,
  `level` VARCHAR(5) NOT NULL,
  `gambar` LONGBLOB NOT NULL,
  PRIMARY KEY (`id_pengguna`)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

/*Table structure for table `barang` */

DROP TABLE IF EXISTS `barang`;

CREATE TABLE `barang` (
  `kode_barang` CHAR(8) NOT NULL,
  `kode_jenis` CHAR(5) NOT NULL,
  `nama_barang` VARCHAR(30) NOT NULL,
  `satuan` VARCHAR(10) NOT NULL,
  `harga` DOUBLE NOT NULL,
  `stok` INT NOT NULL,
  PRIMARY KEY (`kode_barang`),
  KEY `kode_jenis` (`kode_jenis`),
  CONSTRAINT `barang_ibfk_1` FOREIGN KEY (`kode_jenis`) REFERENCES `jenis_barang` (`kode_jenis`)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

/*Table structure for table `barang_keluar` */

DROP TABLE IF EXISTS `barang_keluar`;

CREATE TABLE `barang_keluar` (
  `no_keluar` CHAR(12) NOT NULL,
  `tgl_keluar` DATE NOT NULL,
  `total_keluar` DOUBLE NOT NULL,
  `id_pengguna` CHAR(10) NOT NULL,
  PRIMARY KEY (`no_keluar`),
  KEY `id_pengguna` (`id_pengguna`),
  CONSTRAINT `barang_keluar_ibfk_1` FOREIGN KEY (`id_pengguna`) REFERENCES `pengguna` (`id_pengguna`)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

/*Table structure for table `detail_barang_keluar` */

DROP TABLE IF EXISTS `detail_barang_keluar`;

CREATE TABLE `detail_barang_keluar` (
  `no_keluar` CHAR(12) NOT NULL,
  `kode_barang` CHAR(12) NOT NULL,
  `jml_keluar` INT NOT NULL,
  `subtotal_keluar` DOUBLE NOT NULL,
  KEY `no_keluar` (`no_keluar`),
  KEY `detail_barang_keluar_ibfk_2` (`kode_barang`),
  CONSTRAINT `detail_barang_keluar_ibfk_2` FOREIGN KEY (`kode_barang`) REFERENCES `barang` (`kode_barang`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `detail_barang_keluar_ibfk_3` FOREIGN KEY (`no_keluar`) REFERENCES `barang_keluar` (`no_keluar`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=INNODB DEFAULT CHARSET=latin1;

/*Table structure for table `barang_masuk` */

DROP TABLE IF EXISTS `barang_masuk`;

CREATE TABLE `barang_masuk` (
  `no_masuk` CHAR(12) NOT NULL,
  `tgl_masuk` DATE NOT NULL,
  `total_masuk` DOUBLE NOT NULL,
  `id_distributor` CHAR(10) NOT NULL,
  `id_pengguna` CHAR(10) NOT NULL,
  PRIMARY KEY (`no_masuk`),
  KEY `id_pengguna` (`id_pengguna`),
  KEY `id_distributor` (`id_distributor`),
  CONSTRAINT `barang_masuk_ibfk_1` FOREIGN KEY (`id_pengguna`) REFERENCES `pengguna` (`id_pengguna`),
  CONSTRAINT `barang_masuk_ibfk_2` FOREIGN KEY (`id_distributor`) REFERENCES `distributor` (`id_distributor`)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

/*Table structure for table `detail_barang_masuk` */

DROP TABLE IF EXISTS `detail_barang_masuk`;

CREATE TABLE `detail_barang_masuk` (
  `no_masuk` CHAR(12) NOT NULL,
  `kode_barang` CHAR(12) NOT NULL,
  `jml_masuk` INT NOT NULL,
  `subtotal_masuk` DOUBLE NOT NULL,
  KEY `kode_barang` (`kode_barang`),
  KEY `no_masuk` (`no_masuk`),
  CONSTRAINT `detail_barang_masuk_ibfk_2` FOREIGN KEY (`kode_barang`) REFERENCES `barang` (`kode_barang`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `detail_barang_masuk_ibfk_3` FOREIGN KEY (`no_masuk`) REFERENCES `barang_masuk` (`no_masuk`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=INNODB DEFAULT CHARSET=latin1;

/*Table structure for table `pemesanan` */

DROP TABLE IF EXISTS `pemesanan`;

CREATE TABLE `pemesanan` (
  `no_pesan` CHAR(12) NOT NULL,
  `tgl_pesan` DATE NOT NULL,
  `total_pesan` DOUBLE NOT NULL,
  `id_distributor` CHAR(10) NOT NULL,
  `id_pengguna` CHAR(10) NOT NULL,
  PRIMARY KEY (`no_pesan`),
  KEY `id_distributor` (`id_distributor`),
  KEY `id_pengguna` (`id_pengguna`),
  CONSTRAINT `pemesanan_ibfk_1` FOREIGN KEY (`id_distributor`) REFERENCES `distributor` (`id_distributor`),
  CONSTRAINT `pemesanan_ibfk_2` FOREIGN KEY (`id_pengguna`) REFERENCES `pengguna` (`id_pengguna`)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

/*Table structure for table `detail_pemesanan` */

DROP TABLE IF EXISTS `detail_pemesanan`;

CREATE TABLE `detail_pemesanan` (
  `no_pesan` CHAR(12) NOT NULL,
  `kode_barang` CHAR(12) NOT NULL,
  `jml_pesan` INT NOT NULL,
  `subtotal_pesan` DOUBLE NOT NULL,
  `status` VARCHAR(20) NOT NULL,
  KEY `no_pesan` (`no_pesan`),
  KEY `kode_barang` (`kode_barang`),
  CONSTRAINT `detail_pemesanan_ibfk_1` FOREIGN KEY (`no_pesan`) REFERENCES `pemesanan` (`no_pesan`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `detail_pemesanan_ibfk_2` FOREIGN KEY (`kode_barang`) REFERENCES `barang` (`kode_barang`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=INNODB DEFAULT CHARSET=latin1;

/*Table structure for table `sementara_barang_masuk` */

DROP TABLE IF EXISTS `sementara_barang_masuk`;

CREATE TABLE `sementara_barang_masuk` (
  `kode_barang` CHAR(8) NOT NULL,
  `nama_barang` VARCHAR(30) NOT NULL,
  `satuan` VARCHAR(10) NOT NULL,
  `harga` DOUBLE NOT NULL,
  `stok` INT NOT NULL,
  `jml_masuk` INT NOT NULL,
  `subtotal_masuk` DOUBLE NOT NULL,
  KEY `kode_barang` (`kode_barang`)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

/*Table structure for table `sementara_keluar` */

DROP TABLE IF EXISTS `sementara_keluar`;

CREATE TABLE `sementara_keluar` (
  `kode_barang` CHAR(8) NOT NULL,
  `nama_barang` VARCHAR(30) NOT NULL,
  `satuan` VARCHAR(20) NOT NULL,
  `harga` DOUBLE NOT NULL,
  `stok` INT NOT NULL,
  `jml_keluar` INT NOT NULL,
  `subtotal_keluar` DOUBLE NOT NULL
) ENGINE=INNODB DEFAULT CHARSET=latin1;

/*Table structure for table `sementara_pesan` */

DROP TABLE IF EXISTS `sementara_pesan`;

CREATE TABLE `sementara_pesan` (
  `kode_barang` CHAR(8) NOT NULL,
  `nama_barang` VARCHAR(30) NOT NULL,
  `satuan` VARCHAR(10) NOT NULL,
  `harga` DOUBLE NOT NULL,
  `stok` INT NOT NULL,
  `jml_pesan` INT NOT NULL,
  `subtotal_pesan` DOUBLE NOT NULL,
  `status` VARCHAR(20) NOT NULL,
  KEY `kode_barang` (`kode_barang`)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

/* Trigger structure for table `detail_barang_keluar` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `barang_keluar` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `barang_keluar` AFTER INSERT ON `detail_barang_keluar` FOR EACH ROW BEGIN
	UPDATE barang SET stok = stok-NEW.jml_keluar
    WHERE kode_barang=NEW.kode_barang;
END */$$


DELIMITER ;

/* Trigger structure for table `detail_barang_masuk` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `barang_masuk` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `barang_masuk` AFTER INSERT ON `detail_barang_masuk` FOR EACH ROW BEGIN
	UPDATE barang SET stok = stok+NEW.jml_masuk
    WHERE kode_barang = NEW.kode_barang;
END */$$
