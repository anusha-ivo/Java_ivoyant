import java.io.FileWriter;
import java.io.File;

public class File_writer {
    public static void main(String[] args) throws Exception{
        File f=new File("file_write.txt");
        f.createNewFile();
        System.out.println(f.exists());
        FileWriter fw=new FileWriter(f,true);
        fw.write("this is first line\n ");




    fw.flush();
        fw.close();
        long l=f.length();
        System.out.println(l);
    }
}
