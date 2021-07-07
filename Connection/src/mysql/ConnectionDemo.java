
package mysql;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionDemo {
    
    public static void main(String[] args) throws SQLException {
       ConnectionClass s = new ConnectionClass();
      Connection con = s.getConnection();
      if(con == null)
          System.out.println("Connection Failed !");
      else
          System.out.println("Connection Success !");
    }
    
    
}
