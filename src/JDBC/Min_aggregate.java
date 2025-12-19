package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Min_aggregate {
    public static void main(String[] args)throws Exception{
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","anu@8296");
        Statement s=c.createStatement();
        String sql="select max(age) from anu_2";
        ResultSet r=s.executeQuery(sql);
        if(r.next()){
            System.out.println(r.getInt(1));
        }

    }
}
