-- INSERT INTO `proveedor` (`nombre`, `direccion`, `numero_tele`, `correo`)
-- VALUES 
-- ('Proveedor1', 'Calle Falsa 123', '555-1234', 'contacto@proveedor1.com'),
-- ('Proveedor2', 'Avenida Siempre Viva 456', '555-5678', 'contacto@proveedor2.com');

-- INSERT INTO `usuario` (`cusuario`, `nombre`, `apellido_paterno`, `apellido_materno`, `contrasena`, `rcontrasena`, `correo_electronico`, `tipo_usuario`)
-- VALUES
-- ('edgardo', 'Edgardo', 'Lopez', 'Ramirez', '12345', '12345', 'edgardo@example.com', 'Administrador');

INSERT INTO `venta` (`cusuario`, `nombre_producto`, `cantidad`, `precio`, `fecha`, `forma_pago`)
VALUES
('edgardo', 'Pan Integral', 20, 30.0, '2024-05-01', 'Efectivo');

INSERT INTO `compra` (`id_proveedor`, `nombre_insumo`, `cantidad`, `fecha`, `total_compra`)
VALUES
(1, 'Harina', 100, '2024-05-01', 2000.0),
(2, 'Levadura', 50, '2024-05-02', 500.0);

INSERT INTO `insumo` (`id_producto`, `id_proveedor`, `id_compra`, `nombre_insumo`, `descripcion`, `cantidad_existencia`, `precio_unidad`, `unidad_medida`, `nombre_pro`, `nombre_proveedor`)
VALUES
(NULL, 1, 1, 'Harina', 'Harina de trigo para pan', 1000, 20.0, 'Kg', NULL, 'Proveedor1'),
(NULL, 2, 2, 'Levadura', 'Levadura para pan', 500, 10.0, 'Kg', NULL, 'Proveedor2');

INSERT INTO `producto` (`id_venta`, `nombre_producto`, `descripcion`, `cantidad_existencia`, `precio_unidad`)
VALUES
(NULL, 'Pan de Ajo', 'Pan con ajo y hierbas finas', 15, 25.0),
(NULL, 'Pan Integral', 'Pan 100% integral', 20, 30.0);
