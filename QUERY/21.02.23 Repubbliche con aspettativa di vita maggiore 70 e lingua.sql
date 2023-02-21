USE world;

SELECT co.Code, co.name, co.GovernmentForm, cl.Language, co.LifeExpectancy
FROM country as co
inner join countrylanguage as cl on co.Code = cl.CountryCode
where co.LifeExpectancy>70 AND co.GovernmentForm like "Republic" and cl.IsOfficial="T"
ORDER BY co.LifeExpectancy desc;