--시퀀스
--테이블에 자동으로 생성하는 자동 번호발생기
create sequence book_swq start with 1 increment by 1;

--오라클 뷰
--물리적 테이블에 근거한 논리적인 가상 테이블 
--실질적으로 데이터를 저장하고 있지않지만 시용자가 테이블을 사용하는것과 같은 뷰를 사용함
--실질적으로 데이터를 저장하고있는 기본테이블이 있어야함
--create or replace view 뷰이름 as(select 문) 

create or replace view result_inner_join as
select a.empno, a.ename, a.job, a.hiredate, a.deptno, b.dname, b.loc
from emp a, dept b where a.deptno=b.deptno;
