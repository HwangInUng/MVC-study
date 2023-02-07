create table dept(
	deptno int primary key auto_increment
	, dname varchar(20)
) default character set utf8;


create table emp(
	empno int primary key auto_increment
	, ename varchar(20)
	, sal int default 3200
	, deptno int
	, constraint fk_dept_emp foreign key (deptno) references dept(deptno)
) default character set utf8;

select * from emp;

delete from emp where ename='테스트';