
INSERT INTO TipoPersona (idTipoPersona, descTipoPer) VALUES (1,'Conjunto Residencial UD')
,(2,'Propietario'), (3,'Responsable'), (4,'Arrendatario'), (5,'Habitante'), (6,'Proveedor');

INSERT INTO TipoEstructura (idTipoEstructura, descTipoEstructura) VALUES (1, 'Conjunto') ,
(2, 'Apartamento') , (3, 'Parqueadero Cubierto') , (4, 'Local') , (5 ,'salón comunal'), (6, 'Zona Parrilla'),
(7, 'Parqueadero Exterior'), (8,'Cancha');
 
INSERT INTO TipoTransaccion (idTipoTran,descTipoTran) VALUES (1,'Ingreso'),(2,'Egreso');

INSERT INTO UnidadMedida (idUnidad,nomUnidad) VALUES (1,'Mes'),(2,'Hora') ,(3,'Año');

INSERT INTO Concepto (idConcepto, nomConcepto, idUnidad, idTipoTran) VALUES  (1 ,'Cuota Administración','1','1'), 
(2 ,'Cuota Extraordinaria','3','1'), (3 ,'Arriendo Local','1','1'), (4 ,'Arriendo Parqueadero Exterior','1','1'), 
(5, 'Prestamo Hora Parilla','2','1'), (6 ,'Prestamo Hora Salon Comunal','2','1'), (7 ,'Multa','1','1'), 
(8, 'Servicio Energía','1','2'), (9, 'Servicio Agua','1','2'), (10, 'Servicio Internet','1','2'), 
(11, 'Servicio Administración Conjunto','1','2'), (12, 'Servició Aseo','1','2'), (13 ,'Servicio Ascensor','1','2'), 
(14, 'Servicio Vigilancia','1','2'), (15 ,'Impuestos','3','2'),(16, 'Declaración','3','2');

INSERT INTO Persona (codigo,nombrepersona) VALUES ('P1','Kurt Burns'), ('P2','Chelsea Walker'), ('P3','Jason Cruz'),
('P4','Jessica Strickland'), ('P5','Caitlin Oneal'), ('P6','Samantha Lopez'), ('P7','Jamie Singh'), ('P8','Samuel Robinson'), 
('P9','Kara Wallace'), ('P10','Rhonda Becker'), ('P11','Jasmine Simmons'), ('P12','Susan Dickson'),('P13','Inmobiliaria Herrera'),
('P14','Alejandro Laitón');

INSERT INTO Estructura (nestructura, est_nestructura, idtipoestructura, area) VALUES ('E1',NULL,1,20000),('E2',NULL,1,20000),
('E3',NULL,1,20000), ('E4','E1',2,25), ('E5','E1',2,25), ('E6','E1',2,25), ('E7','E5',3,13), ('E8','E1',7,14), ('E9','E1',5,254),
('E10','E1',6,200), ('E11','E1',4,16), ('E12','E1',8,135);

INSERT INTO Empleado (codempleado,codigo, nombre, apellido, celular, cedula) VALUES (1,'P8','Christine' ,'Walker', 312298177, 79865678), 
(2,'P10','Matthew' ,'Perez', 321456134, 51112806), (3,'P13','Gary' ,'Browning', 311678908, 51639254);

INSERT INTO HistoricoValorConcepto (consecutivo,idConcepto, idUnidad, idTipoTran, codempleado, fecha, valor, estado) VALUES (1,1,1,1,2, '2022-01-01',900000,FALSE),
(2,1,1,1,2, '2023-01-01',1050000,TRUE), (3,2,3,1,2, '2022-01-01',450000,FALSE), (4,2,3,1,2, '2023-01-01',500000,TRUE),
(5,3,1,1,2, '2022-01-01',730000,FALSE), (6,3,1,1,2, '2023-01-01',780000,TRUE), (7,4,1,1,2, '2022-01-01',180000,FALSE), (8,4,1,1,2, '2023-01-01',220000,TRUE),
(9,5,2,1,2, '2022-01-01',41800,FALSE), (10,5,2,1,2, '2023-01-01',60000,TRUE), (11,6,2,1,1, '2022-01-01',170000,FALSE), (12,6,2,1,1, '2023-01-01',230000,TRUE),
(13,7,1,1,1, '2022-01-01',45000,FALSE), (14,7,1,1,1, '2023-01-01',80000,TRUE), (15,8,1,2,1, '2022-01-01',4100000,FALSE), (16,8,1,2,1, '2023-01-01',4440000,TRUE),
(17,9,1,2,1, '2022-01-01',2040000,FALSE), (18,9,1,2,1, '2023-01-01',2150000,TRUE), (19,10,1,2,1, '2022-01-01',3750000,FALSE), (20,10,1,2,1, '2023-01-01',3900000,TRUE),
(21,11,1,2,3, '2022-01-01',2160000,FALSE), (22,11,1,2,3, '2023-01-01',2440000,TRUE), (23,12,1,2,3, '2022-01-01',3000000,FALSE), (24,12,1,2,3, '2023-01-01',3300000,TRUE),
(25,13,1,2,3, '2022-01-01',750000,FALSE), (26,13,1,2,3, '2023-01-01',850000,TRUE), (27,14,1,2,3, '2022-01-01',8000000,FALSE), (28,14,1,2,3, '2023-01-01',8500000,TRUE),
(29,15,3,2,3, '2022-01-01',8500000,FALSE), (30,15,3,2,3, '2023-01-01',9000000,TRUE), (31,16,3,2,3, '2022-01-01',3000000,FALSE), (32,16,3,2,3, '2023-01-01',3500000,TRUE);

INSERT INTO Conceptotipopersona (idconcepTipoPer, idconcepto, idtipoPersona, fechaRegistro, idtipotran) 
VALUES (1,1,2,'2023-01-01',1),(2,1,3,'2023-01-01',1),(3,1,5,'2023-01-01',1),
(4,2,2,'2023-01-01',1),(5,2,3,'2023-01-01',1),(6,2,5,'2023-01-01',1),
(7,7,2,'2023-01-01',1),(8,7,3,'2023-01-01',1),(9,7,5,'2023-01-01',1),
(10,3,4,'2023-01-01',1),(11,3,5,'2023-01-01',1),
(12,4,4,'2023-01-01',1),(13,4,5,'2023-01-01',1),
(14,5,5,'2023-01-01',1),(15,6,5,'2023-01-01',1),
(16,8,6,'2023-01-01',2),(17,9,6,'2023-01-01',2),
(18,10,6,'2023-01-01',2),(19,11,6,'2023-01-01',2),
(20,12,6,'2023-01-01',2),(21,13,6,'2023-01-01',2),(22,14,6,'2023-01-01',2),
(23,15,1,'2023-01-01',2),(24,16,1,'2023-01-01',2);

INSERT INTO tenencia (consectenencia, idtipopersona, codigo, nestructura, estadotenencia) VALUES
(1,1,'P11','E1',FALSE),(2,1,'P12','E2',FALSE),(3,1,'P14','E3',FALSE),
(4,2,'P1','E5',TRUE),(5,2,'P2','E7',TRUE),(6,2,'P3','E6',TRUE),
(7,3,'P7','E8',TRUE),(8,3,'P13','E4',TRUE),(9,3,'P9','E10',TRUE),
(10,4,'P4','E6',TRUE),(11,4,'P5','E4',TRUE),(12,4,'P6','E11',TRUE),
(13,5,'P1','E5',TRUE),(14,5,'P4','E6',TRUE),(15,5,'P5','E4',TRUE),
(16,6,'P13','E12',TRUE),(17,6,'P8','E9',TRUE),(18,6,'P10','E10',TRUE);

CREATE INDEX nombre_idx ON Persona (upper(nombrePersona));








