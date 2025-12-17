package week3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class Merge {
    public static void main(String[] args)  throws Exception{
        PrintWriter p = new PrintWriter("file_3.txt");
    File f=new File("file_1.txt");
    f.createNewFile();
    PrintWriter p2=new PrintWriter(f);
    p2.println("this is file 1 content");
    p2.println("this is file 1 content");
    p2.println("this is file 1 content");
    p2.flush();
    p2.close();


    System.out.println(f.exists());
        FileReader fr=new FileReader(f);
        BufferedReader b=new BufferedReader(fr);
        String s=b.readLine();
        while (s!=null){
            p.println(s);
            s=b.readLine();
        }


        File f2=new File("file_2.txt");
        f2.createNewFile();
        PrintWriter p3=new PrintWriter(f2);
        p3.println("file 2 contents");
        p3.println("file 2 contents");
        p3.println("file 2 contents");
        p3.flush();
        p3.close();
        BufferedReader b2=new BufferedReader(new FileReader(f2));

        String s2=b2.readLine();
        while(s2!=null){
            p.println(s2);
            s2=b2.readLine();

        }

      p.flush();
        p.close();



    }
}
