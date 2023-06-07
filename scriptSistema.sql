CREATE DATABASE  IF NOT EXISTS `boardstop` 
USE `boardstop`;

DROP TABLE IF EXISTS `tblcategoria`;
CREATE TABLE `tblcategoria` (
  `idCategoria` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nomeCategoria` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idCategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
DROP TABLE IF EXISTS `tblmarca`;
CREATE TABLE `tblmarca` (
  `idMarca` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nomeMarca` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idMarca`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `tblproduto`;
CREATE TABLE `tblproduto` (
  `idProduto` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `descricaoProduto` varchar(20) DEFAULT NULL,
  `unidadeProduto` varchar(20) DEFAULT NULL,
  `codBarrasProduto` varchar(20) DEFAULT NULL,
  `saldoMinimoProduto` double DEFAULT NULL,
  `saldoProduto` double DEFAULT NULL,
  `marcaProduto` int(10) unsigned DEFAULT NULL,
  `categoriaProduto` int(10) unsigned DEFAULT NULL,
  `subCategoriaProduto` int(10) unsigned DEFAULT NULL,
  `dataCadastroProduto` varchar(20) DEFAULT NULL,
  `usuarioCadastroProduto` varchar(20) DEFAULT NULL,
  `dataAlteracaoProduto` varchar(20) DEFAULT NULL,
  `usuarioAlteracaoProduto` varchar(20) DEFAULT NULL,
  `ativoProduto` tinyint(1) DEFAULT NULL,
  `tipoProduto` varchar(10) DEFAULT NULL,
  `custoPraticadoProduto` double DEFAULT NULL,
  `margemProduto` double DEFAULT NULL,
  `vendaVendaProduto` double DEFAULT NULL,
  PRIMARY KEY (`idProduto`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `tblsubcategoria`;
CREATE TABLE `tblsubcategoria` (
  `idSubCategoria` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nomeSubCategoria` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idSubCategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=latin1;
DROP TABLE IF EXISTS `tblusuario`;
CREATE TABLE `tblusuario` (
  `idUsuario` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nomeUsuario` varchar(20) DEFAULT NULL,
  `senhaUsuario` varchar(20) DEFAULT NULL,
  `loginUsuario` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO tblusuario ( idUsuario, nomeUsuario, senhaUsuario, loginUsuario ) VALUES ( 1, 'master', 123, 'master' )