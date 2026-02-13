package mapInterface;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class properties_1 {
    public static void main(String[] args)throws Exception{

       // FileInputStream f = new FileInputStream("C:\\Users\\Anusha JM\\Desktop\\anu.properties.txt");
        FileInputStream f=new FileInputStream("anu2.properties");
        Properties p=new Properties();
        p.load(f);
        System.out.println(p);
        String s =p.getProperty("city");
        System.out.println(s);
        p.setProperty("age","22");
        FileOutputStream f2=new FileOutputStream("anu2.properties");
        p.store(f2,"new ");

    }
}
