Drop Database if exists jdbc_course;

Create Database jdbc_course;

use jdbc_course;

Create table employee (
  id int(15) primary key auto_increment,
  username varchar(20),
  pass varchar(10)
);