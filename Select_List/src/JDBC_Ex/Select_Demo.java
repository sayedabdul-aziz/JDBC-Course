package JDBC_Ex;

// Import the packages
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Select_Demo {

    static Connection connect;

    public static void main(String[] args) {
        ConnectClass db1 = new ConnectClass();
        try { // get Connection
            connect = db1.getConnect();
            //Arraylist
            ArrayList<user> list = new ArrayList();
            // Create a statement
            Statement st = connect.createStatement();
            //Execute the query
            ResultSet rs = st.executeQuery("Select * from employe");
            while (rs.next()) {
                list.add(new user(rs.getInt("ID"), rs.getString("Name"), rs.getString("Gender")));
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).id + " " + list.get(i).name + " " + list.get(i).Gender);
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
