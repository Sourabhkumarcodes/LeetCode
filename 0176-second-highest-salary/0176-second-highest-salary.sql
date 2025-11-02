# Write your MySQL query statement below
select MAX(Salary) as SecondHighestSalary from employee where salary<>(Select max(salary) from employee); 