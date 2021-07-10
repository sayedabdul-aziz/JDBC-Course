package JDBC_ex;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSet_Methods {

    static Connection con;

    public static void main(String[] args) {
        ConnectClass db = new ConnectClass();
        try {
            con = db.getConnect();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from students");
            rs.next(); //next row
            rs.next(); //next row
            rs.next(); //next row
            rs.next(); //next row
            rs.first();  // first row
            rs.last();  //last row
            rs.absolute(4); // row selected
            rs.relative(5); //move up or down (+/-)
            rs.relative(-2);
            System.out.println("احنا واقفين فين ؟  " +rs.getRow());
            rs.deleteRow();  //deleted the current row 
            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
           
        } catch (SQLException e) {
            e.getStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException sql) {
                sql.getStackTrace();
            }
        }
    }

}
