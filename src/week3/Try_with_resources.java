package week3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Try_with_resources {
    public static void main(String[] args)throws Exception{
        try (BufferedReader b=new BufferedReader(new FileReader("file_1.txt"))){
            String s=b.readLine();
            while(s!=null){
                System.out.println(s);
                s=b.readLine();
            }
        }
        catch (Exception e){

        }
    }
}
