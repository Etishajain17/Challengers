# Write your MySQL query statement below
DELETE 
FROM PERSON
WHERE ID NOT IN (
    SELECT ID FROM (
        SELECT MIN(ID) AS ID
          FROM PERSON
      GROUP BY EMAIL) T);