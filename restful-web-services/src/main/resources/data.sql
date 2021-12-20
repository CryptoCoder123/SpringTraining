-- DROP table Contacts if exists;
-- CREATE TABLE USER (
--     id BIGINT IDENTITY NOT NULL,
--     first_name VARCHAR(50) NOT NULL,
--     last_name VARCHAR(50) NOT NULL,
--     PRIMARY KEY (id)
-- );
insert into user values(10001,sysdate(),'ab');
insert into user values(10002,sysdate(),'cd');
insert into user values(10003,sysdate(),'ef');
insert into post values(11001,'My First Post!',10001);
insert into post values(11002,'My Second Post!',10001);