import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Buffered_writer {
    public static void main(String[] args) throws Exception{
        File f=new File("file_write.txt");
        System.out.println(f.exists());
        BufferedWriter bw=new BufferedWriter(new FileWriter(f,true));
        bw.write("by bufferedwrite");
        bw.newLine();
        bw.write("next new line");
        bw.flush();
        bw.close();
        long l=f.length();
        System.out.println(l);

    }
}
