package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Update_multiple {
    public static void main(String[] args)throws Exception{
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","anu@8296");
        Statement s=c.createStatement();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter increment");
        int in=sc.nextInt();
        System.out.println("enter condition");
        double cond=sc.nextDouble();
        String sql=String.format("update anu_1 set id=id+%d where id>%f",in,cond);
        s.execute(sql);
        System.out.println("inserted succesfully");



    }
}
