select * from estado where sigla = 'RJ'

insert into cidades (nome, area, estado_id)
values("Campinas", 795, 94)

insert into cidades (nome, area, estado_id)
values("Niterói", 133.9, 88)

insert into cidades(nome, area, estado_id)
values(
  "Caruaru",
   920.6,
   (select id from estado where sigla = "PE"))

insert into cidades(nome, area, estado_id)
values("Juazeiro do Norte",
248.2,
(select id from estado where sigla = "CE"))

select * from cidades

DELETE  FROM cidades
WHERE id = 1;

