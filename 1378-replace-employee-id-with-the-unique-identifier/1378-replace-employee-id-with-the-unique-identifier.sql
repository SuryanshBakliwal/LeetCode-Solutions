# Write your MySQL query statement below
select unique_id, name from Employees LEFT JOIN EmployeeUNI ON  EmployeeUNI.id = Employees.id;