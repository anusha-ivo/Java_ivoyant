import java.io.FileInputStream;

public class Filestream_read {
    public static void main(String[] args) throws Exception{
        FileInputStream f=new FileInputStream("file_1.txt");
        int i=f.read();
        while(i!=-1){
            System.out.println((char)i);
            i=f.read();
        }
    }
}
