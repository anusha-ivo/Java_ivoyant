package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Initial_without_hardcode {
    public static void main(String[] args)throws Exception{
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","anu@8296");
        Statement s=c.createStatement();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter initial char");
        String ini=sc.next()+'%';
        String sql=String.format("select * from anu_2 where name like '%s'",ini);
        ResultSet r=s.executeQuery(sql);
        while (r.next()){
            System.out.println(r.getString(1)+" "+r.getInt(2));
        }





    }
}
