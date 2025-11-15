import java.io.File;
import java.io.FileReader;

public class File_read_char {
    public static void main(String[] args)throws Exception{
        File f1=new File("file_write.txt");
        FileReader f=new FileReader(f1);
        char[] ch=new char[(int)f1.length()];
        f.read(ch);
        int count=0;
        for(char c:ch){
            count++;
            System.out.println(c);
        }
        System.out.println(count);

    }
}
