import java.io.File;

public class File_methods {
    public static void main(String[] args){
        File f=new File("file_1");
        System.out.println( f.exists());
        File f2=new File("directory_1");
        System.out.println( f2.exists());
        System.out.println( f.isFile());
        System.out.println( f.isDirectory());
        System.out.println( f2.isDirectory());
    String[] s=f2.list();
    for(String a:s){
        System.out.println(a);
    }

        long l=f2.length();
        System.out.println(l);



    }

}
