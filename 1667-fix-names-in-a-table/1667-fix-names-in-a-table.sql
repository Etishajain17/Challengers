/* Write your PL/SQL query statement below */
SELECT user_id, initcap(name) name
FROM users
ORDER BY user_id;