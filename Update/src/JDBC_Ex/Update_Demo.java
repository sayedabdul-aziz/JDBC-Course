package JDBC_Ex;

// Import the packages
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Update_Demo {

    static Connection connect;

    public static void main(String[] args) {
        ConnectClass db1 = new ConnectClass();
        try { // get Connection
            connect = db1.getConnect();
            // Create a statement
            Statement st = connect.createStatement();
            //Execute the query
           String Query = "UPDATE emp SET Gender = 'male' WHERE id = 4";
            st.executeUpdate(Query);
            System.out.println("Updating records successfully !!");
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
