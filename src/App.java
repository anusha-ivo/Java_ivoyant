package driver_4;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception{
        Connection c=DriverManager.getConnection( "jdbc:mysql://localhost:3306/kodnest", "root", "anu@8296");
Statement s=c.createStatement();
ResultSet r=s.executeQuery("select * from student");
while(r.next()){
    System.out.println(r.getString(1)+"  "+r.getInt(2));
}

        
    }
}
