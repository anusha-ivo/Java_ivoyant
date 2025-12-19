package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc_connection_1 {
    public static void main(String[] args)throws Exception {
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","anu@8296");
        System.out.println("connection established");
        Statement s=c.createStatement();
        ResultSet r=s.executeQuery("select * from Student_1");
        while(r.next()) {
            System.out.println(r.getInt("age") + "  " + r.getString("name"));
        }


    }
}
