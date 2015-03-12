-- DROP TABLE salas;

CREATE TABLE salas (
    nro_sala INTEGER NOT NULL,
    capacidade INTEGER NOT NULL,
    em_manutencao BOOLEAN NOT NULL,
    qt_poltrona_especial INTEGER NOT NULL,
    PRIMARY KEY (nro_sala)
);

INSERT 
INTO salas (nro_sala, capacidade, em_manutencao, qt_poltrona_especial)
VALUES (1, 100, false, 10);

INSERT 
INTO salas (nro_sala, capacidade, em_manutencao, qt_poltrona_especial)
VALUES (2, 200, false, 20);

INSERT 
INTO salas (nro_sala, capacidade, em_manutencao, qt_poltrona_especial)
VALUES (3, 300, false, 30);