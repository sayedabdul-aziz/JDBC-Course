![Java Database Connectivity (JDBC)](https://imgur.com/da4ViM5.png)
<h3 align="center">Java Database Connectivity (JDBC) :tada: </h3>
<p align="center">
  Path to a free self-taught education in JDBC!
</p>
<p align="center">
  <a href="https://github.com/sayedabdul-aziz">
  <img alt="Author Profile" src="https://img.shields.io/badge/Author-Sayed--Abdulaziz-Yellow.svg">
  </a>
  <a href="https://github.com/sayedabdul-aziz/JDBC-Cousre">
  <img alt="Java Database Connectivity (JDBC)" src="https://img.shields.io/badge/Repo-JDBC--Course-blue.svg">
  </a>
</p>

# Contents :memo:

- [Introduction](#introduction)
  - [JDBC Definition](#jdbc-definition) 
  - [Pre-requisite](#pre-requisite) 
  - [JDBC Architecture](#jdbc-architecture) 
  - [JDBC Driver](#jdbc-driver) 
- [Connection](#connection)
  - [Environment Setup](#environment-setup)
  - [JDBC Application Process](#jdbc-application-process)
- [Statement Interface](#statement-interface)
- [PreparedStatement Interface](#preparedstatement-interface)
- [ResultSet Interface](#resultset-interface)
- Contents Updated....

# Introduction
## JDBC Definition
Java Database Connectivity (JDBC) is an application programming interface (API) for the Java programming language, which defines how a client may access a database. It is a Java-based data access technology used for Java to database connectivity and it is part of the Java Standard Edition platform and given by Oracle corporation. It provides methods to query and update data in a database and is oriented toward relational databases.

As said by Oracle Corporation, The Java Database Connectivity (JDBC) API is the industry standard for database-independent connectivity between the Java programming language and a wide range of databases – SQL databases and other tabular data sources, such as spreadsheets or flat files. The JDBC API provides a call-level API for SQL-based database access.

JDBC technology allows us to use the Java programming language to exploit “Write Once, Run Anywhere” capabilities for applications that require access to enterprise data. With a JDBC technology-enabled driver, we can connect all corporate data even in a heterogeneous environment.

## Pre-requisite
Before moving further, you need to have a good understanding of the following two subjects:
- Java Basics ( including OOP, and Exception handling).
- SQL language (basic queries). Review from [HERE](https://github.com/sayedabdul-aziz/JDBC-Cousre/tree/main/SQL%20Review) .

## JDBC Architecture
The JDBC API supports both two-tier and three-tier processing models for database access but in general, JDBC Architecture consists of two layers:

- JDBC API : This provides the application-to-JDBC Manager connection.
- JDBC Driver API : This supports the JDBC Manager-to-Driver Connection.

The JDBC API uses a driver manager and database-specific drivers to provide transparent connectivity to heterogeneous databases.

**A list of popular interfaces of JDBC API are given below:**
- Driver interface
- Connection interface
- Statement interface
- PreparedStatement interface
- CallableStatement interface
- ResultSet interface
- ResultSetMetaData interface
- DatabaseMetaData interface
- RowSet interface

The JDBC driver manager ensures that the correct driver is used to access each data source. The driver manager is capable of supporting multiple concurrent drivers connected to multiple heterogeneous databases.

Following is the architectural diagram, which shows the location of the driver manager with respect to the JDBC drivers and the Java application

<p align="center">
  <img alt="Java Database Connectivity (JDBC)" src="https://imgur.com/9OVwDlz.png">
  </a>
</p>

## JDBC Driver
JDBC Driver is a software component that enables java application to interact with the database. There are 4 types of JDBC drivers:
- JDBC-ODBC bridge driver.
- Native-API driver (partially java driver).
- Network Protocol driver (fully java driver).
- Thin driver/pure (fully java driver).

<p align="center">
  <img alt="JDBC Driver" src="https://imgur.com/pmppW5X.png">
  </a>
</p>
 
 ### 1- JDBC-ODBC bridge driver ###
The JDBC-ODBC bridge driver uses ODBC driver to connect to the database. The JDBC-ODBC bridge driver converts JDBC method calls into the ODBC function calls. This is now discouraged because of thin driver.
             
    Oracle does not support the JDBC-ODBC Bridge from Java 8.

**Advantages:**

- easy to use.
- can be easily connected to any database.

**Disadvantages:**
- Performance degraded because JDBC method call is converted into the ODBC function calls.
- The ODBC driver needs to be installed on the client machine.

_____________________________________

### 2- Native-API driver ###
The Native API driver uses the client-side libraries of the database. The driver converts JDBC method calls into native calls of the database API. It is not written entirely in java.

**Advantages:**

- performance upgraded than JDBC-ODBC bridge driver.

**Disadvantages:**
- The Native driver needs to be installed on the each client machine.
- The Vendor client library needs to be installed on client machine.

_____________________________________

### 3- Network Protocol driver ###
The Network Protocol driver uses middleware (application server) that converts JDBC calls directly or indirectly into the vendor-specific database protocol. It is fully written in java.

**Advantages:**
- No client side library is required because of application server that can perform many tasks like auditing, load balancing, logging etc.

**Disadvantages:**
- Network support is required on client machine.
- Requires database-specific coding to be done in the middle tier.
- Maintenance of Network Protocol driver becomes costly because it requires database-specific coding to be done in the middle tier.

_____________________________________

### 4- Thin driver ###
The thin driver converts JDBC calls directly into the vendor-specific database protocol. That is why it is known as thin driver. It is fully written in Java language.

**Advantages:**
- Better performance than all other drivers.
- No software is required at client side or server side.

**Disadvantages:**
- Drivers depend on the Database.
_______________________________________________________________________________
________________________________________________

# Connection

## Environment Setup
To start developing with JDBC, you should setup your JDBC environment by following the steps shown below. We assume that you are working on a Windows platform.
- JDK `1.8` or later version. You can download from [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html).
- Any text editor to write the code or IDE `Netbeans`. You can download from [Netbeans](https://netbeans.apache.org/download/index.html).

now we need to Install a database that is most suitable for you like: `Mysql DB`, `Orcal DB`, `Sql Server`, `Postgre DB`, `Mongo DB`, etc.

You can have plenty of choices and most common are `Mysql DB`. So we will download its environment `Xampp` from [Here](https://www.apachefriends.org/download.html).

After installing `Xampp`. Run it and Start `Apache`, `MySQL` as in the figure below.

<p align="center">
  <img alt="JDBC Driver" src="https://imgur.com/kE9YctK.png">
  </a>
</p>

Then, Go to [Local Server](http://127.1.1.0/phpmyadmin/index.php) .It is a local hosting that will display all the databases that we will create and access them.

<p align="center">
  <img alt="JDBC Driver" src="https://imgur.com/QEcE4Uh.png">
  </a>
</p>

## JDBC Application Process
In order to create a JDBC Application, you need to follow a few steps.

<p align="center">
  <img alt="JDBC Driver" src="https://imgur.com/P1mjZ2T.png">
  </a>
</p>

### 1) Import the packages
You need to include all the packages that contain the JDBC classes needed for database programming. Most often, using import `java.sql.*` will suffice.

### 2) Register the JDBC driver
The `forName()` method of Class class is used to register the driver class. This method is used to dynamically load the driver class.

**- Example:**
      
    Class.forName("com.mysql.cj.jdbc.Driver");  

**Note**: Since JDBC 4.0, explicitly registering the driver is optional.

### 3) Create the connection object
The `getConnection()` method of DriverManager class is used to establish connection with the database.

**- Syntax of getConnection() method:**
       
    - public static Connection getConnection(String url)throws SQLException  
    - public static Connection getConnection(String url,String name,String password)throws SQLException  

**- Example:**    

    public Connection getConnection()throws SQLException{ 
    return DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_Name", "root", ""); 
    }

*to Know about url and Server information* [Click Here](https://github.com/sayedabdul-aziz/JDBC-Cousre/tree/main/LocalHost-Info) .

Before `Step (4)`, Go to [Connection JDBC Application](https://github.com/sayedabdul-aziz/JDBC-Cousre/tree/main/Connection) that java code to get Connection with MySQL DB.  

### 4) Create the Statement object
The `createStatement()` method of Connection interface is used to create statement. The object of statement is responsible to execute queries with the database.

**- Syntax of createStatement() method:**
      
    public Statement createStatement()throws SQLException  
**- Example:**
    
    Statement stmt=con.createStatement();  

### 5) Execute the query
The `executeQuery()` method of Statement interface is used to execute queries to the database. This method returns the object of ResultSet that can be used to get all the records of a table.

**- Syntax of executeQuery() method:**
    
    public ResultSet executeQuery(String sql)throws SQLException  

**- Example:**

    ResultSet rs=stmt.executeQuery("select * from emp");  
    while(rs.next()){  
      System.out.println(rs.getInt(1)+" "+rs.getString(2));  
    }  

### 6) Close the connection object
By closing connection object statement and ResultSet will be closed automatically. The `close()` method of Connection interface is used to close the connection.

**- Syntax of close() method**

    public void close()throws SQLException  

**- Example:**

    con.close();  
 
GOOD WORK :call_me_hand: . Now, Go to [The First JDBC Application](https://github.com/sayedabdul-aziz/JDBC-Cousre/tree/main/First_JDBC_APP) :running_man: 

______________________________________________________________

> If you didn't review on `SQL syntax`. Please!!, Go to review it from [HERE](https://github.com/sayedabdul-aziz/JDBC-Cousre/tree/main/SQL%20Review) .

________________________________________________________

# Statement Interface
In JDBC the Statement is an interface that represents a SQL statement. We execute Statement objects, and for select queries, ResultSet objects will be generated, which is a table of data representing a database result set. We need a Connection object to create a Statement object.

There are three types of JDBC statements :
1) Statement
2) PreparedStatement
3) CallableStatement

The first type i.e. Statement is also called as Simple Statement because it is used with simple SQL statements without parameters. The PreparedStatement and CallableStatement both are extended from Statement (or, Simple Statement). The PreparedStatement is used for precompiling SQL statements that might contain input parameters, and CallableStatement is used to execute stored procedures/functions that may contain both input and output parameters.

JDBC Statement object acts as a vehicle between Java application and database software to send the SQL query from Java application to database software and to bring SQL query results back to Java application from database software.

## Creating Statement Object
Before you can use a Statement object to execute a SQL statement, you need to create one using the Connection object's `createStatement( )` method, as in the following example:

    Statement stmt=con.createStatement();  
    
## Methods of Statement interface:
The important methods of Statement interface are as follows:

|          |     Methode     |     Description    |
|     :---:     |     :---:     |     :---:    |
|1| ResultSet executeQuery(String sql) | is used to execute SELECT query. It returns the object of ResultSet.   |
|2| int executeUpdate(String sql)  | is used to execute specified query, it may be create, drop, insert, update, delete etc.   |
|3| boolean execute(String sql)  | is used to execute queries that may return multiple results.  |

## Statement Examples :

- [Create a table using JDBC application](https://github.com/sayedabdul-aziz/JDBC-Cousre/tree/main/Create_Table) .
- [Drop a table using JDBC application](https://github.com/sayedabdul-aziz/JDBC-Cousre/tree/main/Drop_Table) .
- [Insert records in a table using JDBC application](https://github.com/sayedabdul-aziz/JDBC-Cousre/tree/main/Insert) .
- [Insert records from User in a table using JDBC application](https://github.com/sayedabdul-aziz/JDBC-Cousre/tree/main/Insert_User) .
- [Delete records from a table using JDBC application](https://github.com/sayedabdul-aziz/JDBC-Cousre/tree/main/Delete) .
- [Update records in a table using JDBC application](https://github.com/sayedabdul-aziz/JDBC-Cousre/tree/main/Update) .
- [Select records from a table using JDBC application](https://github.com/sayedabdul-aziz/JDBC-Cousre/tree/main/First_JDBC_APP) .
- [Select records from a table using ArrayList](https://github.com/sayedabdul-aziz/JDBC-Cousre/tree/main/Select_List) .

# PreparedStatement Interface  
The PreparedStatement interface is a subinterface of Statement. It is used to execute parameterized query.

The PreparedStatement interface extends the Statement interface that provides some more advanced features as follows:
- Add parameters into you SQL statement using placeholders in the form of question marks (?). This helps you avoid SQL injection.
- Reuse the PreparedStatement with new parameters in case you need to execute the SQL statement multiple times with different parameters.
- Help increase performance of the executed statement by precompiling the SQL statement.

**Note:** 
- We can use only “?” symbols in the place of values. No other symbols are allowed here.
- “?” symbol is not allowed to replace table names and column names.

## Creating PreparedStatement Object
Before you can use a PreparedStatement you must first create it. You do so using the `Connection.prepareStatement()` .
    
    PreparedStatement preparedStatement = connection.prepareStatement(sql);  
    
## Methods of PreparedStatement interface:
The important methods of Statement interface are as follows:

|          |     Methode     |     Description    |
|     :---:     |     :---:     |     :---:    |
|1| void setInt(int paramIndex, int_value) | sets the integer value to the given parameter index.   |
|2| void setString(int paramIndex, String_value)  | sets the String value to the given parameter index.   |
|3| void setFloat(int paramIndex, float_value)  | sets the float value to the given parameter index.  |
|4| void setDouble(int paramIndex, double_value)  | sets the double value to the given parameter index. |

## PreparedStatement Examples :
- [Insert records in a table using JDBC application](https://github.com/sayedabdul-aziz/JDBC-Cousre/tree/main/Insert_PreparedStatement) .
- [Insert records from User in a table using JDBC application](https://github.com/sayedabdul-aziz/JDBC-Cousre/tree/main/InsertUser_PreparedStatement) .
- [Delete records from a table using JDBC application](https://github.com/sayedabdul-aziz/JDBC-Cousre/tree/main/Delete_PreparedStatement) .
- [Update records in a table using JDBC application](https://github.com/sayedabdul-aziz/JDBC-Cousre/tree/main/Update_PreparedStatement) .
- [Select records from a table using JDBC application](https://github.com/sayedabdul-aziz/JDBC-Cousre/tree/main/Select_PreparedStatement) .

# ResultSet Interface
The SQL statements that read data from a database query, return the data in a result set. The SELECT statement is the standard way to select rows from a database and view them in a result set. The java.sql.ResultSet interface represents the result set of a database query.

A ResultSet object maintains a cursor that points to the current row in the result set. The term "result set" refers to the row and column data contained in a ResultSet object.

## ResultSet Methods:
The methods of the ResultSet interface can be broken down into two categories :

- **Navigational methods** : Used to move the cursor around.
- **Get methods** : Used to view the data in the columns of the current row being pointed by the cursor.

### Navigational methods
|          |     Methode     |     Description    |
|     :---:     |     :---:     |     :---:    |
| 1 |  boolean next( )  |  	is used to move the cursor to the one row next from the current position.   |
| 2 |   boolean previous( ) |  	is used to move the cursor to the one row previous from the current position.   |   
| 3 |    boolean first( ) |  	is used to move the cursor to the first row in result set object.   |
| 4 |    boolean last( ) |  	is used to move the cursor to the last row in result set object.   |
| 5 |   boolean absolute(int row) |  	is used to move the cursor to the specified row number in the ResultSet object.   |
| 6 |   boolean relative(int row) |  	is used to move the cursor to the relative row number in the ResultSet object, it may be positive or negative.   |
| 7 |   int getRow( )      |   Returns the row number that the cursor is pointing to.  |
| 8 |  void beforeFirst( )     |      Moves the cursor just before the first row.   |
| 9 |  public void afterLast( )     |      Moves the cursor just after the last row.  |

### Get methods
There is a get method for each of the **possible data types**, and each get method has two versions:
- One that takes in a column name.
- One that takes in a column index.

|          |     Methode     |     Description    |
|     :---:     |     :---:     |     :---:    |
|1| int getInt(int columnIndex) |	is used to return the data of specified column index of the current row as int.  |
|2|  int getInt(String columnName) |	is used to return the data of specified column name of the current row as int.  |
|3|  String getString(int columnIndex) |	is used to return the data of specified column index of the current row as String.  |
|4|  String getString(String columnName) |	is used to return the data of specified column name of the current row as String.  |

## ResultSet Examples :
A one example show all ResultSet methods in this [JDBC Application](https://github.com/sayedabdul-aziz/JDBC-Cousre/tree/main/ResultSet_Methods) .







