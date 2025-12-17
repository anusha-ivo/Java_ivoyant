package week3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class Merge_alternatively {
    public static void main(String[] args) throws Exception{
        PrintWriter p=new PrintWriter("file_3.txt");
        File f=new File("file_1.txt");
        BufferedReader br=new BufferedReader(new FileReader(f));
        System.out.println(f.exists());
        String s=br.readLine();
        File f2=new File("file_2.txt");
        f2.createNewFile();
        System.out.println(f2.exists());
        BufferedReader br2=new BufferedReader(new FileReader(f2));
        String s1=br.readLine();
        String s2=br2.readLine();
        while((s1!=null)||(s2!=null)){
            if(s1!=null){
                p.println(s1);
                s1=br.readLine();

            }
            if(s2!=null){
                p.println(s2);
                s2=br2.readLine();

            }
        }
        p.flush();
        p.close();



    }
}
