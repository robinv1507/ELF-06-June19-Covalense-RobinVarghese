1 -  select * from emp where job='Softwaredeveloper' and deptno='30'
2-  select * from emp where job='softwaredevelpoer' and deptno='40' and sal>4000
3-  select *  from emp where deptno not IN(10,20)
4-  select * from emp where job NOT IN ('softwaredevelpoer','clerk')  and sal between 1000 and 3000

5-  select * from emp where sal not between 10000 and 20000 and deptno not in(10,20,30) and job not in('salesman')
6-  select * from emp group by sal desc
7-   select max(sal),min(sal),sum(sal) from emp
8-  select count(*) from emp where job='CLERK' and deptno=20
9-  select min(sal),max(sal) from emp where job='salesman';
10-  select deptno,sum(salary) from employee group by deptno