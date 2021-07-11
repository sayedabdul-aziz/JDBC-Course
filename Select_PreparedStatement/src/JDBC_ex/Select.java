package JDBC_ex;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select {

    static Connection con;

    public static void main(String[] args) {
        ConnectClass db = new ConnectClass();
        try {
            con = db.getConnect();

            PreparedStatement ps;
            ps=con.prepareStatement("Select * from students where id =?");
            
            ps.setInt(1, 15);
            
            ResultSet rs = ps.executeQuery();
            rs.next();
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            
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
