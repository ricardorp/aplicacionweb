CREATE SCHEMA APLICACION_WEB;

-- CREACION DE TABLAS
-- TABLA PAIS
CREATE TABLE APLICACION_WEB.pais (
  id_pais INTEGER NOT NULL,
  nombre_pais VARCHAR(64) NOT NULL,
  codigo_pais VARCHAR(2) NOT NULL,
  valor_pais INTEGER NOT NULL,
  CONSTRAINT PK_PAIS PRIMARY KEY (id_pais)
);
-- TABLA CIUDAD
CREATE TABLE APLICACION_WEB.ciudad (
  id_ciudad INTEGER NOT NULL,
  nombre_ciudad VARCHAR(64) NOT NULL,
  id_pais INTEGER NOT NULL,
  valor_ciudad INTEGER,
  CONSTRAINT PK_CIUDAD PRIMARY KEY (id_ciudad),
  CONSTRAINT FK_CIUDAD_PAIS FOREIGN KEY (id_pais)
    REFERENCES pais(id_pais) ON DELETE RESTRICT
);

-- TIPO DE JUEGOS OLIMPICOS
CREATE TABLE APLICACION_WEB.tipo_jjoo (
  id_tipo_jjoo INTEGER NOT NULL,
  descripcion_tipo VARCHAR(32) NOT NULL,
  CONSTRAINT PK_TIPO_JJOO PRIMARY KEY (id_tipo_jjoo)
);

-- TABLA SEDE DE JUEGOS OLIMPICOS
CREATE TABLE APLICACION_WEB.sede_jjoo (
  año INTEGER NOT NULL,
  id_tipo_jjoo INTEGER NOT NULL,
  sede INTEGER NOT NULL,
  CONSTRAINT PK_SEDE_JJOO PRIMARY KEY (año, id_tipo_jjoo),
  CONSTRAINT FK_SEDE_JJOO_CIUDAD FOREIGN KEY (sede)
    REFERENCES ciudad(id_ciudad) ON DELETE RESTRICT,
  CONSTRAINT FK_SEDE_JJOO_TIPO_JJOO FOREIGN KEY (id_tipo_jjoo)
    REFERENCES tipo_jjoo(id_tipo_jjoo) ON DELETE RESTRICT
);

INSERT INTO APLICACION_WEB.pais VALUES
  (1,'España', 'es', 100),
  (2, 'Portugal', 'pt', 200),
  (3, 'Francia', 'fr', 50),
  (4, 'Italia', 'it', 150);

INSERT INTO APLICACION_WEB.ciudad VALUES
  (1, 'La Coruña', 1, 93),
  (2, 'Madrid', 1, CAST(NULL AS INTEGER)),
  (3, 'Barcelona', 1, 124),
  (4, 'Lisboa', 2, 134),
  (5, 'Oporto', 2, CAST(NULL AS INTEGER))),
  (6, 'Coimbra', 2, CAST(NULL AS INTEGER))),
  (7, 'Chamonix', 3, 123),
  (8, 'París', 3, 5),
  (9, 'Niza', 3, CAST(NULL AS INTEGER))),
  (10, 'Milán', 4, 135),
  (11, 'Roma', 4, 125),
  (12, 'Turín', 4, 190);

INSERT INTO APLICACION_WEB.tipo_jjoo VALUES
(1, 'Invierno'),
(2, 'Verano');

INSERT INTO APLICACION_WEB.sede_jjoo VALUES
  (1900, 2, 8),
  (1924, 2, 8),
  (1924, 1, 7),
  (1960, 2, 11),
  (1992, 2, 3),
  (2006, 1, 12);
commit;


