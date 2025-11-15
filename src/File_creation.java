import java.io.File;

public class File_creation {
    public static void main(String[] args) throws Exception{
        File f=new File("file_1.txt");
       System.out.println( f.exists());
       f.createNewFile();
        System.out.println( f.exists());
        System.out.println( "-----------------------------------------------------------");
        File f2=new File("Directory_1");
        System.out.println( f2.exists());
        f2.mkdir();
        System.out.println( f2.exists());
        File f3=new File(f2,"file_dir_1");
        f3.createNewFile();
        System.out.println( f3.exists());

    }
}
