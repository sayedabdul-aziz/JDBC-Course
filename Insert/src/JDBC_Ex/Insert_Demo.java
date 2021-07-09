package JDBC_Ex;

// Import the packages
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert_Demo {

    static Connection connect;

    public static void main(String[] args) {
        ConnectClass db1 = new ConnectClass();
        try { // get Connection
            connect = db1.getConnect();
            // Create a statement
            Statement st = connect.createStatement();
            //Execute the query
           String Query = "Insert into emp (Name,Gender) values ('Mohammed', 'male')";
            st.executeUpdate(Query);
            Query = "Insert into emp (Name,Gender) values ('Ahmed', 'male')";
            st.executeUpdate(Query);
            Query = "Insert into emp (Name,Gender) values ('Sara', 'female')";
            st.executeUpdate(Query);
            Query = "Insert into emp (Name,Gender) values ('Alaa', 'female')";
            st.executeUpdate(Query);
            System.out.println("Thanks Dear !");
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
