import java.io.FileReader;

public class File_reader {
    public static void main(String[] args) throws Exception{
        FileReader f=new FileReader("File_write.txt");
        int i=f.read();
        int count=0;
        while(i!=-1){
            count++;
            System.out.println((char)i);
            i=f.read();
        }
        System.out.println(count);
        /*long l=f.length();
        System.out.println(l);*///not used in file reader

    }
}
