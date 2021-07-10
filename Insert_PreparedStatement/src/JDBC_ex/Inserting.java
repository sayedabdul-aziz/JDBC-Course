package JDBC_ex;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Inserting {

    static Connection con;

    public static void main(String[] args) {
        ConnectClass db = new ConnectClass();
        try {
            con = db.getConnect();
            PreparedStatement ps;
            
            ps=con.prepareStatement("insert into students(Name,Gender) values (?,?)");
            ps.setString(1, "Ali");
            ps.setString(2, "male");
            ps.executeUpdate();
            ps.setString(1, "Ahmed");
            ps.setString(2, "male");
            ps.executeUpdate();
            ps.setString(1, "Alaa");
            ps.setString(2, "female");
            ps.executeUpdate();
            
            System.out.println("Inserting Successfully  !");
            
            
        } catch (SQLException e) {
            e.getStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException sql) {
                sql.getStackTrace();
            }
        }
    }

}
