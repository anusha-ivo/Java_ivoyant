import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FIS_FOS_dynamic {
    public static void main(String[] args)throws Exception{
        Scanner s=new Scanner(System.in);
        System.out.println("enter src file : ");
        String s2=s.next();
        System.out.println("enter dst file : ");
        String s3=s.next();
        FileInputStream f=new FileInputStream(s2);
        FileOutputStream f2=new FileOutputStream(s3);
        int i=f.read();
        while(i!=-1){
            f2.write(i);
            i=f.read();
        }
        f2.close();
    }
}
