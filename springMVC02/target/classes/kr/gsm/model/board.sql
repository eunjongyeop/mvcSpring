create table tbl_board(
  idx int not null auto_increment, 
  title varchar(50) not null, 
  contents varchar(2000) not null, 
  count int default 0,  
  writer varchar(30) not null, 
  indate datetime not null default now(), 
  primary key(idx)
);

insert into tbl_board(title, contents, writer) values ('계시판 연습', '계시판 연습', '관리자');
insert into tbl_board(title, contents, writer) values ('MVC 연습', 'MVC 연습', '홍길동');

select * from tbl_board