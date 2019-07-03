/*
 1. WAQ to display all the employees whose name & job is having exactly 5 characters. 

*/

select  * from employee where fname like '_____' and job like '_____'

/*
  2.WAQ to display the employees whose job starts with 'soft'.
*/


select  * from employee where job like 'soft%'

/*
    3.WAQ to display the maximum salary for each job. 
*/

select  job,max(salary)  from employee  group by job

/*

4.WAQ to display the department numbers along with the number of employees in working it.
*/
select  deptno,count(id) as number_of_employees from employee   group by deptno


/*

5. WAQ to display the minimum salary for each of the job excluding all the
employees whose name ends with 'S'. 

*/

select fname,job, min(salary)   from employee where fname not like  '%s'  group by job

/*

 6.WAQ to display the list of the employees who is working in 'Admin' department. 
*/
select  * from employee where job='admin'


/*
   7.WAQ to display the list of the department names that are working as software developer. 
*/
select  dept_name from department_info where dept_id=(select distinct deppt_id from employee_info where designation='software engineer')

/*
  8.WAQ to display the 2nd maximum salary.
*/
select max(salary) as second_largest_salary from employee where salary<(select  max(salary) from employee)

/*
   9.WAQ to display the 3rd maximum salary .
*/






/*
    10.WAQ to display the 4th least salary.
*/
