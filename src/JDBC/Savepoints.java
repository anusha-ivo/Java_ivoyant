package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Scanner;

public class Savepoints {
    public static void main(String[] args)throws Exception{
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","anu@8296");
        c.setAutoCommit(false);
        Statement s=c.createStatement();
       // s.executeUpdate("create table Ravi_1(name varchar(10),id int)");
        s.executeUpdate("insert into Ravi_1(name,id)values('pallavi',26)");
        s.executeUpdate("insert into Ravi_1(name,id)values('anil',12)");
        Savepoint sv=c.setSavepoint();
        s.executeUpdate("insert into Ravi_1(name,id)values('arun',25)");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter id");
        int id=sc.nextInt();
        if(id>0){
            String sql=String.format("update Ravi_1 set id=%d where name='anil'",id);
        s.executeUpdate(sql);
        }
        else{
            c.rollback(sv);

        }
        s.executeUpdate("insert into Ravi_1(name,id)values('karthik',95)");
c.commit();
System.out.println("completed");

    }
}
