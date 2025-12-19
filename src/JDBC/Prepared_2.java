package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Prepared_2 {
    public static void main(String[] args)throws Exception{
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","anu@8296");
        PreparedStatement ps=c.prepareStatement("insert into Ravi(name,id)values(?,?)");
        ps.setString(1,"sneha");
        ps.setInt(2,15);
        ps.executeUpdate();
        System.out.println("succesfully");



    }
}
