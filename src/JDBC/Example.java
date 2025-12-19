package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) throws Exception {
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1", "root", "anu@8296");
        Statement s = c.createStatement();
        //String sql = "create table anu_4(name varchar(10),age int ,id int )";
        //s.executeUpdate(sql);
        //System.out.println("table created");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("enter name");
            String name = sc.next();
            System.out.println("enter age");
            int age = sc.nextInt();
            System.out.println("enter id");
            int id = sc.nextInt();
            String sql1 = String.format("insert into anu_4(name,age,id)values('%s',%d,%d)", name, age, id);
            s.executeUpdate(sql1);
            System.out.println("do you want to enter another record [y/n]");
            String opt = sc.next();
            if (opt.equalsIgnoreCase("n")) {
                break;
            }
            System.out.println("succesfully inserted");


        }
    }
}
