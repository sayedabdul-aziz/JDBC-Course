<h1 align="center"> 
LocalHost Information </h1>

<p align="center">
  <a href="https://github.com/sayedabdul-aziz">
  <img alt="Author Profile" src="https://img.shields.io/badge/Author-Sayed--Abdulaziz-Yellow.svg">
  </a>
  <a href="https://github.com/sayedabdul-aziz/JDBC-Cousre">
  <img alt="Java Database Connectivity (JDBC)" src="https://img.shields.io/badge/Repo-JDBC--Course-red.svg">
  </a>
</p>

# What is the LocalHost 
LocalHost is the standard host name given to the address of the local computer, and the IP address for your localhost is `127.0.0.1` . The local server isn't connected to the internet, but makes it possible to see your site in the browser as if you're viewing it online - so LocalHost addresses may be used during development of a website.

Since these files are not publicly accessible, when the website is set live, the hostname is replaced with the actual domain name.

# Port number
 All software installed on our computer will run on various software ports managed by operating system. Every software port is identified with port number. In Windows operating system total 65535 software ports are available, in that 1 to 1024 software port numbers reserved for operating system services,
 so all externally installed softwares use remaining software port number between 1025 to 65535.
 
|  Database Software   |   Default Port Number   | 
|     :---:     |     :---:    |
| Oracle    |	  1521    |
| MySQL	    |     3306    |
| PostgreSQL    | 	5432    |

# Database URL Formulation

After you've loaded the driver, you can establish a connection using the `DriverManager.getConnection()` method. For easy reference, let me list the three overloaded DriverManager.getConnection() methods −

    getConnection(String url)
    getConnection(String url, Properties prop)
    getConnection(String url, String user, String password)

Here each form requires a database URL. A database URL is an address that points to your database.

Formulating a database URL is where most of the problems associated with establishing a connection occurs.

Following table lists down the popular JDBC driver names and database URL.

| DBMS	  |   JDBC driver name	|  URL format  |
|     :---:     |     :---:    |     :---:    |
| MySQL	|  com.mysql.cj.jdbc.Driver |	jdbc:mysql://hostname/ databaseName      |
| ORACLE	|   oracle.jdbc.driver.OracleDriver  |  	jdbc:oracle:thin:@hostname:port Number:databaseName   |
|  DB2	  |   COM.ibm.db2.jdbc.net.DB2Driver    |  	jdbc:db2:hostname:port Number/databaseName    |
| Sybase  |	com.sybase.jdbc.SybDriver	    |    jdbc:sybase:Tds:hostname: port Number/databaseName  |

___________________________________________
# Finally
we are using MySql as the database. So we need to know following informations for the mysql database:

- **Driver class:** The driver class for the mysql database is com.mysql.jdbc.Driver.

- **Connection URL:** The connection URL for the mysql database is `jdbc:mysql://localhost:3306/database-name` .

where `jdbc` is the API, `mysql` is the database, `localhost` is the server name on which mysql is running, we may also use IP address, `3306` is the port number and we have the database name.

- **Username:** The default username for the mysql database is `root`.

- **Password:** The default password for the mysql database is empty.

 <br> 
    
 <br>
      
        
 <h4 align="center"> 
 " يَرْفَعِ اللَّهُ الَّذِينَ آمَنُوا مِنْكُمْ وَالَّذِينَ أُوتُوا الْعِلْمَ دَرَجَاتٍ وَاللَّهُ بِمَا تَعْمَلُونَ خَبِيرٌ "
 </h4>


