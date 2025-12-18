package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Transaction_1 {
    public static void main(String[] args)throws Exception{
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","anu@8296");
        Statement s=c.createStatement();
        c.setAutoCommit(false);
        s.executeUpdate("insert into Ravi(name,id)values('priya',35)");
        s.executeUpdate("update Ravi set id=0 where name='priya'");
        c.commit();
        System.out.println("successfully");


    }

}
