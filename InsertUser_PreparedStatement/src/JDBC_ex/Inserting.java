package JDBC_ex;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Inserting {

    static Connection con;

    public static void main(String[] args) {
        ConnectClass db = new ConnectClass();
        try {
            con = db.getConnect();
            Scanner sc = new Scanner(System.in);
            PreparedStatement ps;
            ps=con.prepareStatement("insert into students(Name,Gender) values (?,?)");
            while(true){
            System.out.println("Enter u name :");
            String Name1=sc.nextLine();
            System.out.println("Enter u Gender (male/female) :");
            String Gender1=sc.next();
            
            ps.setString(1, Name1);
            ps.setString(2, Gender1);
            ps.executeUpdate();
            
            System.out.println("Do u need to insert again ?(NO/YES)");
            String action = sc.next();
            sc.nextLine();
            if(action.equals("NO")||action.equals("no")) break;
            
            }
            
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
