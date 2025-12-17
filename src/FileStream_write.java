import java.io.FileOutputStream;

public class FileStream_write {
    public static void main(String[] args)throws Exception{
        FileOutputStream f=new FileOutputStream("File_1.txt");
        f.write("hiu".getBytes());
        f.close();
    }
}
