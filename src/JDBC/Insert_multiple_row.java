package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Insert_multiple_row {
    public static void main(String[] args)throws Exception{
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","anu@8296");
        Statement s=c.createStatement();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("enter name");
            String aname=sc.next();
            System.out.println("enter id");
            int aid=sc.nextInt();
            String sql=String.format("insert into anu_1(name,id)values('%s',%d)",aname,aid);
            s.execute(sql);
            System.out.println("do you want to enter : type (y/n)");
            String op=sc.next();
            if(op.equalsIgnoreCase("n")){
                break;

            }
            System.out.println("inserted successfully");



        }


    }
}
