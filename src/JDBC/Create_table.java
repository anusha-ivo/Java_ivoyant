package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Create_table {
    public static void main(String[] args)throws Exception{
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","anu@8296");
        Statement s=c.createStatement();
        String sql="create table anu_1(name varchar(10),id int)";
        s.execute(sql);
        System.out.println("table is created");
        c.close();
    }
}
