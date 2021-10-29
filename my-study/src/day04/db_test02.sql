--alter (수정)
--필드명 변경
--alter tabler 테이블명 rename column 변경전이름 to 변경후이름
alter table booklist rename column subject to tittle;
alter table rentlist rename column indexk to nunseaq;
alter table memberlist rename column membername to name;

--자료형 변경
--alter table 테이블명 modify 필드명 자료형
alter table booklist modify name varchar2(20);
alter table booklist modify booknum number(5);
alter table rentlist modify booknum number(5);

--필드추가
--alter table 테이블명 add 필드명 자료형
alter table booklist add grage varchar2(15);
alter table memberlist add age number(2)

--필드삭제
--alter table 테이블명 drop colum 필드명
alter tabler booklist drop column grade;

--제약조건 추가/제거
--alter table 테이블명 add constraint 제약조건 제약조건식
alter table memberlist add constraint check_gender check(gender in('f', 'm'));

--alter table 테이블명 drop constraint 제약조건명
alter table booklist drop constraint fk1;

--테이블복사
create table booklist1 as select * from booklist; 

--테이블제거 
drop table booklist1 purge;