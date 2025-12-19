package week3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class file_delete {
    public static void main(String[] args) throws Exception{
        PrintWriter p=new PrintWriter("file_5.txt");
        File f=new File("file_1.txt");
        BufferedReader br=new BufferedReader(new FileReader(f));
        String s=br.readLine();
        while(s!=null){
            boolean b=false;
            File f2=new File("file_2.txt");
            BufferedReader br2=new BufferedReader(new FileReader(f2));
            String s2=br2.readLine();
            while (s2!=null) {
                if (s.equals(s2)) {
                    b = true;
                    break;
                }
                s2= br2.readLine();
            }
            br2.close();
                if(b==false){
                    p.println(s);
                }
                s=br.readLine();


        }
        p.flush();
        p.close();
    }
}
