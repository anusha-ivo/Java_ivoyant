package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc_2 {
    public static void main(String[] args)throws Exception{
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","anu@8296");
        Statement s=c.createStatement();
        ResultSet r=s.executeQuery("select * from Employe_2");
        while(r.next()){
            System.out.println(r.getFloat("salary")+" "+r.getString("name"));
        }


    }
}
