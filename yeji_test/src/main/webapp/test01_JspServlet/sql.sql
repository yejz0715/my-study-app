create table mem(
id varchar2(10),
name varchar2(15),
pwd varchar2(20),
phone varchar2(15)
);

insert into mem values('somi', '이소미', '1234', '010-1234-1234');
insert into mem values('sang', '전상오', '1234', '010-5555-6666');
insert into mem values('light', '김빛나', '1234', '010-2222-3333');


select * from mem;