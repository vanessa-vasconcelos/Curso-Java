select regiao as "Região",
sum(populacao) as Total
from estado
group by regiao
order by Total desc

select 
avg(populacao) as Total
from estado