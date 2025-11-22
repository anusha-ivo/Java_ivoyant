import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy_FOS {
    public static void main(String[] args)throws Exception{
        FileInputStream f=new FileInputStream("File_1.txt");
        FileOutputStream f2=new FileOutputStream("File_OS.txt");//automatically created
        int i=f.read();
        while(i!=-1){
            f2.write(i);
            i=f.read();

        }

        f2.close();
        f.close();
    }
}
