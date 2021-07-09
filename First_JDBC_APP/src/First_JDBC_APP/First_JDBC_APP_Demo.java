package First_JDBC_APP;

// Import the packages

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class First_JDBC_APP_Demo {

    static Connection connect;

    public static void main(String[] args) {
        ConnectClass db1 = new ConnectClass();
        try { // get Connection
            connect = db1.getConnect();
            // Create a statement
            Statement st = connect.createStatement();
            //Execute the query  
            ResultSet rs = st.executeQuery("SELECT * FROM employee");
            
            // Process the results
            
            // Condition check using next() method
            // to check for element
            while (rs.next()) {
                System.out.println("id = " + rs.getString(1)
                        + ", username = " + rs.getString(2) + ", pass = " + rs.getString(3));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            // Close Connection
            try {
                if (connect != null) {
                    connect.close();
                }
            } catch (SQLException s) {
                s.getStackTrace();
            }
        }

    }
}
