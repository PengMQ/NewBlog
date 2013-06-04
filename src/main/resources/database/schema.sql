create database if not exists blog;

use blog;

drop table if exists userTable;

create table if not exists userTable(
    email varchar(50) primary key,
    name varchar(50),
    password varchar(20),
    isValid tinyint(1) default 0
);
