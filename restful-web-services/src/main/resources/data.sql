insert into user_details(id,birth_date, name)
values(1001,current_date(),'ali');

insert into user_details(id,birth_date, name)
values(1002,current_date(),'aref');

insert into user_details(id,birth_date, name)
values(1003,current_date(),'hamed');

insert into post(id,description, user_id)
values(20001, 'i want to learn docker', 1001);

insert into post(id,description, user_id)
values(20002, 'i want to learn aws', 1001);

insert into post(id,description, user_id)
values(20003, 'i want to learn java', 1002);

insert into post(id,description, user_id)
values(20004, 'i want to learn aws', 1003);