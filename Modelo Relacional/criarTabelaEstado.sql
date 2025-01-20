-- Criando a tabela estado!
create table estado(
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  nome VARCHAR(45) NOT NULL,
  sigla VARCHAR(2) NOT NULL,
  regiao ENUM('Norte', 'Nordeste', 'Centro-Oeste', 'Sudoeste', 'Sul') NOT NULL,
  populacao DECIMAL(5, 2)NOT NULL, 
  PRIMARY KEY (id), 
  UNIQUE KEY (nome),
  UNIQUE KEY (sigla)
); 


-- Esse o varchar está dando erro: WARN_DATA_TRUNCATED: Data truncated for column 'regiao' at row 4
ALTER TABLE estado MODIFY regiao VARCHAR(15);