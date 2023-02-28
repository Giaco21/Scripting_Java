USE world;
SELECT co.Code, co.name, COUNT(city.name)
FROM country as co
INNER JOIN city ON co.Code = city.CountryCode
GROUP BY co.name
ORDER BY COUNT(city.name);