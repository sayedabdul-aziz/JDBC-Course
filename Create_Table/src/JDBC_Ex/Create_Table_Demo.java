package JDBC_Ex;

// Import the packages

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_Table_Demo {

    static Connection connect;

    public static void main(String[] args) {
        ConnectClass db1 = new ConnectClass();
        try { // get Connection
            connect = db1.getConnect();
            // Create a statement
            Statement st = connect.createStatement();
            //Execute the query  
            st.execute("Create table emp (ID int Primary Key auto_increment,"
                    + "Name varchar(40), Gender boolean )");
            System.out.println("Creating a table Successfully");
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
