package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class batch_process {
    public static void main(String[] args)throws Exception{
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","anu@8296");
        Statement s=c.createStatement();
        s.addBatch("insert into Ravi_3(name,sal)values('lav',3500)");
        s.addBatch("insert into Ravi_3(name,sal)values('impi',350)");
        s.addBatch("insert into Ravi_3(name,sal)values('hemi',5600)");
        s.executeBatch();
        System.out.println("success");



    }
}
