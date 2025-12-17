package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args)throws Exception{
        Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","anu@8296");
        Statement s=c.createStatement();
        String sql="delete from anu_1 where name='bhoo'";
        s.execute(sql);
        System.out.println("deleted");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter delete criteria");
        int ids=sc.nextInt();
        String sqll=String.format("delete from anu_1 where id>%d",ids);
        s.execute(sqll);
        System.out.println("deleted");
        String sq="insert into anu_1(name,id)values('anu',34)";
        s.execute(sq);
        String sq2="insert into anu_1(name,id)values('kav',9)";
        s.execute(sq2);
ResultSet or =s.executeQuery("select * from anu_1 order by id asc");
while(or.next()){
    System.out.println(or.getString(1)+" "+or.getInt(2));
}

    }
}
