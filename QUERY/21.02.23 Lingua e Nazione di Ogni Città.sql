use world;
select co.code, c.name, co.name, cl.language, cl.percentage
from city as c
inner join country as co
on c.CountryCode = co.code
inner join countrylanguage as cl on co.code = cl.countryCode
order by c.name asc;
