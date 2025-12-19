import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferReader_ex {
    public static void main(String[] args) throws Exception{
        File f=new File("file_write.txt");
        System.out.println(f.exists());
        BufferedReader br=new BufferedReader(new FileReader(f));
        String s=br.readLine();
        while(s!=null){
            System.out.println(s);
            s=br.readLine();
        }
        br.close();
        
    }
}
