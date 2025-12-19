package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Scanner;

public class Save_1 {
    public static void main(String[] args)throws Exception{
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","anu@8296");
        c.setAutoCommit(false);
        Statement s=c.createStatement();
        //s.executeUpdate("create table Ravi_3(name varchar(10),sal float)");
        s.executeUpdate("insert into Ravi_3(name,sal)values('anu',20000)");
        s.executeUpdate("insert into Ravi_3(name,sal)values('bhoo',24000)");
        Savepoint sv=c.setSavepoint();
        s.executeUpdate("insert into Ravi_3(name,sal)values('kav',26000)");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter sal");
        double sal=sc.nextFloat();
        if(sal<100){
            c.rollback(sv);

        }
        else{
            String sql=String.format("update Ravi_3 set sal=%f where name='anu'",sal);
            s.executeUpdate(sql);
        }
        s.executeUpdate("insert into Ravi_3(name,sal)values('ranju',29000)");
        c.commit();
        System.out.println("success");





    }
}
