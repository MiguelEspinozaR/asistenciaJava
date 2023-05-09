--
-- File generated with SQLiteStudio v3.3.3 on ma. may. 9 00:36:06 2023
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: personal
DROP TABLE IF EXISTS personal;
CREATE TABLE personal (
    id_personal     INT             PRIMARY KEY
                                    UNIQUE
                                    NOT NULL,
    nombre_completo VARCHAR (5, 50),
    hora_llegada    DATETIME
);

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
