# Write your MySQL query statement below
SELECT distinct author_id as id
FROM views 
Where author_id = viewer_id
ORDER BY author_id ASC;