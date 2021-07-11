package JDBC_ex;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Update {

    static Connection con;

    public static void main(String[] args) {
        ConnectClass db = new ConnectClass();
        try {
            con = db.getConnect();

           PreparedStatement ps;
            ps=con.prepareStatement("Update students set Name = ?,Gender = ? where id =?");

            ps.setString(1,"Rana");
            ps.setString(2,"female");
            ps.setInt(3,13);
            ps.executeUpdate();

            System.out.println("Updating Successfully  !");
            
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
