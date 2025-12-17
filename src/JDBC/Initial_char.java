package JDBC;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Initial_char {
    public static void main(String[] args)throws Exception{
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","anu@8296");
        Statement s=c.createStatement();
        String sql="select * from anu_2 where name like 'a%'";
        ResultSet r=s.executeQuery(sql);
        while(r.next()){
            System.out.println(r.getString(1)+" "+r.getInt(2));
        }

    }
}
