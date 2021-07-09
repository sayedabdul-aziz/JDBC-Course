package JDBC_Ex;

// Import the packages
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert_User_Demo {

    static Connection connect;

    public static void main(String[] args) {
        ConnectClass db1 = new ConnectClass();
        try { // get Connection
            connect = db1.getConnect();
            // Create a statement
            Statement st = connect.createStatement();
            //Execute the query
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Enter U name");
                String name = sc.nextLine();
                System.out.println("Enter U Gender(Male/Female)");
                String Gender = sc.next();
                String Query = "Insert into emp (Name,Gender) values ('" + name + "', '" + Gender + "')";
                st.executeUpdate(Query);
                System.out.println("Inserting data into the table Successfully....");
                System.out.println("Do u need to insert again ? (Yes/No)");
                String bol = sc.next();
                sc.nextLine();
                if(bol.equals("No")||bol.equals("no")) break;
            }
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
