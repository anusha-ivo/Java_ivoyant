package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Transaction_2 {
    public static void main(String[] args)throws Exception{
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","anu@8296");
        c.setAutoCommit(false);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter updation value");
        int up=sc.nextInt();
        System.out.println("enter name ");
        String name=sc.next();
        Statement s=c.createStatement();
        String sql=String.format("update Ravi set name='%s' where id=%d",name,up);
        s.executeUpdate("delete from Ravi where id=15");
        s.executeUpdate(sql);
        c.commit();
        System.out.println("sucesss");

    }
}
