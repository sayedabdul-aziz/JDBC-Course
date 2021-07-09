
package First_JDBC_APP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectClass {
    private static final String HOST = "127.0.0.1";
    private static final int PORT = 3306;
    private static final String DB_NAME = "jdbc_course";
    private static final String USER = "root";
    private static final String PASS = "";
    private static final String URL = String.format("jdbc:mysql://%s:%d/%s",HOST,PORT,DB_NAME);
    // URL = "jdbc:mysql://localhost:3306/employee"
    static Connection con;
    
   public Connection getConnect() throws SQLException{
       con=DriverManager.getConnection(URL, USER, PASS);
       return con;
   }
    
    
}
