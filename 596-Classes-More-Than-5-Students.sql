
SELECT class FROM (
    SELECT class, COUNT(class) as \students\ FROM courses
    GROUP BY class
) AS tab
WHERE students>4;