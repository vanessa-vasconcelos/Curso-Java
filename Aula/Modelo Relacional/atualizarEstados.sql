UPDATE estado
SET nome = 'Maranhão'
WHERE sigla = 'MA'

SELECT nome FROM estado WHERE sigla = 'MA'

UPDATE estado `estado`
SET nome = 'Paraná', populacao = 11.32
WHERE sigla = 'PR'

SELECT est.nome, sigla, populacao from estado est
WHERE sigla = 'PR'