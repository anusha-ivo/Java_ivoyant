package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Range {
    public static void main(String[] args)throws Exception{
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","anu@8296");
        Statement s=c.createStatement();
       // String sql="create table anu_2(name varchar(10),age int)";
        //s.execute(sql);
        System.out.println("table created");
        //String sql2="insert into anu_2(name,age)values('ramya',23)";
       String sql3="insert into anu_2(name,age)values('kav',34)";
       // s.executeUpdate(sql2);
        s.executeUpdate(sql3);
        String sql4="update anu_2 set name='anu' where age=14";
        s.executeUpdate(sql4);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter begin");
        int begin=sc.nextInt();
        System.out.println("enter end");
        int end=sc.nextInt();
        String sql5=String.format("select * from anu_2 where age>=%d and age<=%d",begin,end);
        ResultSet re =s.executeQuery(sql5);
        while(re.next()){
            System.out.println(re.getString(1)+" "+re.getInt(2));
        }




    }
}
