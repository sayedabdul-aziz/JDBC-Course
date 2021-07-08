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
- 
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
 
GOOD WORK :call_me_hand: . Now, Go to [The First JDBC Application]() :running_man: 
