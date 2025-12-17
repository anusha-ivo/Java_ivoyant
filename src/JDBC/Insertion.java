package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insertion {
    public static void main(String[] args)throws Exception{
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","anu@8296");
        Statement s=c.createStatement();
        String sql="insert into anu_1(name,id)values('kav',202)";
        s.execute(sql);
        System.out.println("inserted");
        c.close();
        c.close();

    }
}
