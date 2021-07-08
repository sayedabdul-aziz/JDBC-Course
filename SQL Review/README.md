
![SQL)](https://imgur.com/UJ574Df.png)
<h3 align="center">SQL (Structured Query Language)</h3>
<p align="center">
  Path to a free self-taught education in SQL!
</p>
<p align="center">
  <a href="https://github.com/sayedabdul-aziz">
  <img alt="Author Profile" src="https://img.shields.io/badge/Author-Sayed--Abdulaziz-Yellow.svg">
  </a>
  <a href="https://github.com/sayedabdul-aziz/JDBC-Cousre">
  <img alt="Java Database Connectivity (JDBC)" src="https://img.shields.io/badge/Repo-JDBC--Course-blue.svg">
  </a>
</p>

# Contents

- [Introduction](#introduction)
  - [SQL Definition](#sql-definition) 
  - [RDBMS Definition](#rdbms-definition) 
- [SQL Syntax](#sql-syntax)
  - [Create Database](#create-database)
  - [Drop Database](#drop-database)
  - [Create Table](#create-table)
  - [Drop Table](#drop-table)
  - [INSERT Statement](#insert-statement)
  - [DELETE Statement](#delete-statement)
  - [UPDATE Statement](#update-statement)
  - [SELECT Statement](#select-statement)
- Contents Updated....

# Introduction

## SQL Definition
Structured Query Language (SQL) is a standardized language that allows you to perform operations on a database, such as creating entries, reading content, updating content, and deleting entries.

SQL is supported by almost any database you will likely use, and it allows you to write database code independently of the underlying database.

## RDBMS Definition
RDBMS stands for Relational Database Management System.

RDBMS is the basis for SQL, and for all modern database systems such as MS SQL Server, IBM DB2, Oracle, MySQL, and Microsoft Access.

The data in RDBMS is stored in database objects called tables. A table is a collection of related data entries and it consists of columns and rows.

# SQL Syntax

## Create Database
The `CREATE DATABASE` statement is used for creating a new database is

    CREATE DATABASE database-name;
 
## Drop Database
The `DROP DATABASE` statement is used for deleting an existing database is

    DROP DATABASE database-name;
   
 ____________________________________________ 

### A database most often contains one or more tables. A table consists of columns and rows.
 
 **Below is a selection from the "Customers" table:**
 
|      ID       |     Name      |     City     |    Country   |
|     :---:     |     :---:     |     :---:    |     :---:    |
|       1       |  Sayed Abdul-Aziz  |    Cairo     |     Egypt    |
|       2       | Alfreds Futterkiste  |  Berlin     |    Germany   |
|       3       | Antonio Moreno  |   México D.F.    |     México    |
|       4       | Berglunds snabbköp  |    Luleå      |     	Sweden     |
 
## Create Table
The `CREATE TABLE` statement is used to create a new table in a database.

### Syntax
    CREATE TABLE table_name (
      column1 datatype NULL/NOT NULL,
      column2 datatype,
      column3 datatype,
      ....
    );

By default, a column can hold NULL values.The `NOT NULL` constraint enforces a column to NOT accept NULL values.

### Eaxmple:
    CREATE TABLE Customers (
    ID int NOT NULL,
    Name varchar(30),
    City varchar(40),
    Country varchar(40)
    );
   
   
The empty "Customers" table will now look like this:

|      ID       |     Name      |     City     |    Country   |
|     :---:     |     :---:     |     :---:    |     :---:    |
|               |               |              |              |


## Drop Table
The `DROP TABLE` statement is used for deleting an existing database is

    DROP TABLE table-name;

## INSERT Statement
The `INSERT INTO` statement is used to insert new records in a table.

### Syntax 
- Specify both the column names and the values to be inserted:
    
      INSERT INTO table_name (column1, column2, ...) VALUES (value1, value2, ...);
 
### Eaxmple:
      INSERT INTO Customers (ID, Name) VALUES (1, 'Sayed Abdul-Aziz');
   
   
The "Customers" table will now look like this:

|      ID       |     Name      |     City     |    Country   |
|     :---:     |     :---:     |     :---:    |     :---:    |
|       1       |  Sayed Abdul-Aziz  |    Null     |     Null    |

- If you are adding values for all the columns of the table, you do not need to specify the column:

      INSERT INTO table_name VALUES (value1, value2, ...);
 
### Eaxmple:
   
      INSERT INTO Customers VALUES (1, 'Sayed Abdul-Aziz', 'Cairo', 'Egypt');
   
   
The "Customers" table will now look like this:

|      ID       |     Name      |     City     |    Country   |
|     :---:     |     :---:     |     :---:    |     :---:    |
|       1       |  Sayed Abdul-Aziz  |    Cairo     |    Egypt    |

## DELETE Statement
The `DELETE` statement is used to delete data from tables.

### Syntax 
    
      DELETE FROM table_name WHERE condition;

**Note** : Be careful when deleting records in a table! The `WHERE` clause specifies which record(s) should be deleted. If you omit the `WHERE` clause, all records in the table will be deleted!

### Eaxmple:
      DELETE FROM Customers WHERE Name ='Sayed Abdul-Aziz';
  
The "Customers" table will now look like this:

|      ID       |     Name      |     City     |    Country   |
|     :---:     |     :---:     |     :---:    |     :---:    |
|       2       | Alfreds Futterkiste  |  Berlin     |    Germany   |
|       3       | Antonio Moreno  |   México D.F.    |     México    |
|       4       | Berglunds snabbköp  |    Luleå      |     	Sweden     |

## UPDATE Statement
The `UPDATE` statement is used to update data.

### Syntax 
    
      UPDATE table_name SET column1 = value1, column2 = value2, ... WHERE condition;

**Note** : Be careful when updating records. If you omit the WHERE clause, ALL records will be updated!

### Eaxmple:
      UPDATE Customers SET Name = 'Alfred Schmidt', City= 'Frankfurt' WHERE ID = 2;
  
The "Customers" table will now look like this:

|      ID       |     Name      |     City     |    Country   |
|     :---:     |     :---:     |     :---:    |     :---:    |
|       1       |  Sayed Abdul-Aziz  |    Cairo     |    Egypt    |
|       2       | Alfred Schmidt  |  Frankfurt     |    Germany   |
|       3       | Antonio Moreno  |   México D.F.    |     México    |
|       4       | Berglunds snabbköp  |    Luleå      |     	Sweden     |

## SELECT Statement 
The `SELECT` statement is used to select data from a database. The data returned is stored in a result table, called the result-set.

### Syntax 
    
      SELECT column1, column2, ... FROM table_name;
      
### Eaxmple:
      SELECT Name, City FROM Customers;
     
- If you want to select all the fields available in the table, use the following syntax:

      SELECT * FROM table_name;

### Eaxmple:
      SELECT * FROM Customers;

-If you want to select only those records that fulfill a specified condition.

     SELECT column1, column2, ... FROM table_name WHERE condition;

### Eaxmple:
      SELECT Name, Country FROM Customers WHERE ID = 1;

### Operators in The WHERE Clause
The following operators can be used in the WHERE clause:

| Operator	|  Description | Example |
|     :---:     |     :---:     |     :---:    |
|    =  	  |   Equal   	  |   `SELECT * FROM Customers WHERE City = 'Cairo' ; `  |
|    >  	  |	Greater than  	  |	 `SELECT * FROM Customers WHERE ID > 30; `  |
|    <	    |   Less than	  	  | `SELECT * FROM Customers WHERE ID < 60; `  |
|    >=	    |   Greater than or equal  	  |	 `SELECT * FROM Customers WHERE ID >= 22; `  |
|    <=  	  |	Less than or equal	  	  |  `SELECT * FROM Customers WHERE ID <= 33; `  |
|    !=     | 	Not equal          |   `SELECT * FROM Customers WHERE ID != 43; `  |
| BETWEEN	  | Between a certain range  	  |	 `SELECT * FROM Customers WHERE ID BETWEEN 12 AND 40 ;`  |
| LIKE  	  |	Search for a pattern	  	  | `SELECT * FROM Customers WHERE City LIKE 'c%'; `  |
| IN        |	To specify multiple possible values for a column	  | `SELECT * FROM Customers WHERE City IN ('Paris','Zagazig'); `  |



