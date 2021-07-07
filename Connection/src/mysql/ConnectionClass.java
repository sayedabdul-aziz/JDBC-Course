
// You are Sure that "MySql JDBC Driver" in Libraries folder ??  

package mysql;
// Import the packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
    private static final String HOST ="127.0.0.1";
    private static final int PORT =3306;
    private static final String DB_NAME ="jdbc_course";
    private static final String USER ="root";
    private static final String PASS ="";
    private static final String URL = String.format("jdbc:mysql://%s:%d/%s",HOST,PORT,DB_NAME);
     //    jdbc:mysql://localhost:3306/CheckConnect1
    private static Connection connect;
    // Create Connection
    public Connection getConnection() {
    try{   //Don't Forget to throw Exception
    connect =DriverManager.getConnection(URL, USER, PASS);
    }catch(SQLException sql){
        System.out.println(sql.getMessage());
    }   
       return connect;
    }
}
