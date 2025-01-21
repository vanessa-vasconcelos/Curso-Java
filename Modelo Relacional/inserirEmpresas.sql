ALTER TABLE empresas MODIFY cnpj VARCHAR(14);

INSERT INTO empresas(nome, cnpj)
VALUES
  ('Bradesco', 85276141000194),
  ('Vale', 83537655000120),
  ('Cielo', 03537653000120);


DESC empresas;
DESC prefeitos;
select * from empresas;
select * from cidades;

insert into empresas_unidades
  (empresa_id, cidade_id, sede)
values
  (1, 2, 1),
  (1, 3, 0),
  (2, 2, 0),
  (2, 3, 1);
