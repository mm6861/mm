create table car_info(
ci_num number(10,0) not null primary key,
ci_name varchar2(100) not null,
ci_year number(4) not null,
ci_vendor varchar2(100) not null,
ci_etc varchar2(4000)
);

create SEQUENCE car_info_ci_num;
insert into car_info(ci_num,ci_name,ci_year,ci_vendor)
values((select nvl(max(ci_num),0)+1 from car_info),'Arteon',2019,'Æø½º¹Ù°Õ');

select * from car_info;

drop table car_info;