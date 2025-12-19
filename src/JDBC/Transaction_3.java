package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Transaction_3 {
    public static void main(String[] args)throws Exception{

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1", "root", "anu@8296");
        try {
            c.setAutoCommit(false);
            Scanner sc = new Scanner(System.in);
            Statement st = c.createStatement();
            System.out.println("enter name");
            String name = sc.next();
            System.out.println("enter id");
            int id = sc.nextInt();
            //st.executeUpdate("insert into Ravi(name,id)values('promodh',76)");
            String sql = String.format("update Ravi set name='%s' where id=%d", name, id);
            int x = (10 / 0);
            st.executeUpdate("insert into Ravi(name,id)values('prom',56)");
            st.executeUpdate(sql);
            c.commit();
        }
        catch (Exception e) {
            c.rollback();
            System.out.println("failed ");
        }
        System.out.println("success");


    }
}
