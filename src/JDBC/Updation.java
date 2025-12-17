package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Updation {
    public static void main(String[] args)throws Exception{
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","anu@8296");
        Statement s=c.createStatement();
        //Scanner sc=new Scanner(System.in);
        String sql="update anu_1 set id=22 where name='divya'";
        String sql1="update anu_1 set id=0 where name='bhoo'";
        s.execute(sql);
        s.execute(sql1);

        System.out.println("updated");


    }
}
