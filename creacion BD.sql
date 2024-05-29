use panaderia;

CREATE TABLE `proveedor` (
  `id_proveedor` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `numero_tele` varchar(50) NOT NULL,
  `correo` varchar(79) NOT NULL,
  PRIMARY KEY (`id_proveedor`)
);

CREATE TABLE `usuario` (
  `cusuario` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido_paterno` varchar(50) NOT NULL,
  `apellido_materno` varchar(50) DEFAULT NULL,
  `contrasena` varchar(40) NOT NULL,
  `rcontrasena` varchar(40) NOT NULL,
  `correo_electronico` varchar(50) NOT NULL,
  `tipo_usuario` varchar(25) NOT NULL,
  PRIMARY KEY (`cusuario`)
);

CREATE TABLE `venta` (
  `id_venta` int NOT NULL AUTO_INCREMENT,
  `cusuario` varchar(50) DEFAULT NULL,
  `nombre_producto` varchar(70) DEFAULT NULL,
  `cantidad` int DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `forma_pago` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_venta`),
  KEY `venta_ibfk_1` (`cusuario`),
  CONSTRAINT `venta_ibfk_1` FOREIGN KEY (`cusuario`) REFERENCES `usuario` (`cusuario`)
);
CREATE TABLE `compra` (
  `id_compra` int NOT NULL AUTO_INCREMENT,
  `id_proveedor` int DEFAULT NULL,
  `nombre_insumo` varchar(70) NOT NULL,
  `cantidad` int NOT NULL,
  `fecha` date NOT NULL,
  `total_compra` float NOT NULL,
  PRIMARY KEY (`id_compra`),
  KEY `id_proveedor` (`id_proveedor`),
  CONSTRAINT `compra_ibfk_1` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedor` (`id_proveedor`)
);

CREATE TABLE `insumo` (
  `id_insumo` int NOT NULL AUTO_INCREMENT,
  `id_producto` varchar(50) DEFAULT NULL,
  `id_proveedor` int DEFAULT NULL,
  `id_compra` int DEFAULT NULL,
  `nombre_insumo` varchar(70) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `cantidad_existencia` int NOT NULL,
  `precio_unidad` float NOT NULL,
  `unidad_medida` varchar(20) NOT NULL,
  `nombre_pro` varchar(50) DEFAULT NULL,
  `nombre_proveedor` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_insumo`),
  KEY `id_proveedor` (`id_proveedor`),
  KEY `id_producto` (`id_producto`),
  KEY `id_compra` (`id_compra`),
  CONSTRAINT `insumo_ibfk_1` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedor` (`id_proveedor`),
  CONSTRAINT `insumo_ibfk_3` FOREIGN KEY (`id_compra`) REFERENCES `compra` (`id_compra`)
);

CREATE TABLE `producto` (
  `id_producto` int NOT NULL AUTO_INCREMENT,
  `id_venta` int DEFAULT NULL,
  `nombre_producto` varchar(50) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `cantidad_existencia` int NOT NULL,
  `precio_unidad` float NOT NULL,
  PRIMARY KEY (`id_producto`),
  KEY `id_venta` (`id_venta`),
  CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`id_venta`) REFERENCES `venta` (`id_venta`)
);