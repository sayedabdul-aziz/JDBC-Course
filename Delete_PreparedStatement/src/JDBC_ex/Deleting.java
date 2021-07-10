package JDBC_ex;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Deleting {

    static Connection con;

    public static void main(String[] args) {
        ConnectClass db = new ConnectClass();
        try {
            con = db.getConnect();
            Scanner sc = new Scanner(System.in);
            PreparedStatement ps;
            ps=con.prepareStatement("delete from students where id = ?");
            
            ps.setInt(1,11);
            ps.executeUpdate();
            ps.setInt(1,12);
            ps.executeUpdate();
            
            System.out.println("Deleting Successfully  !");
            
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
