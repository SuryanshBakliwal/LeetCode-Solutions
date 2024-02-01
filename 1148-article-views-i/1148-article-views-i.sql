# Write your MySQL query statement below
select DISTINCT author_id as id from Views where views.author_id=views.viewer_id ORDER BY author_id ASC ;