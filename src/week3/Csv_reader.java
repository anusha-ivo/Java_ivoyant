package week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Csv_reader {
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new FileReader("data.csv"));
        String s=br.readLine();
        while(s!=null){
            System.out.println(s);
            s=br.readLine();
        }
        BufferedWriter bw=new BufferedWriter(new FileWriter("data.csv",true));
        bw.write("sneha,22,bang");
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
