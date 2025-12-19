package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Prepare {
    public static void main(String[] args)throws Exception{
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","anu@8296");
        Statement s=c.createStatement();
       // s.executeUpdate("create table Ravi(name varchar(20),id int)");
        PreparedStatement ps=c.prepareStatement("insert into Ravi(name,id)values(?,?)");
        ps.setString(1,"anu");
        ps.setInt(2,24);
        ps.setString(1,"kav");
        ps.setInt(2,21);
        ps.executeUpdate();
        System.out.println("successfully");





    }

}
