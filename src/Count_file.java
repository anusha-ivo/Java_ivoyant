import java.io.File;

public class Count_file {
    public static void main(String[] args){
        File f=new File("Directory_1");
        System.out.println(f.exists());
        int count=0;
        String[] s=f.list();
        for(String a:s) {
            File f2=new File(f,a);
            if (f2.isFile()) {
                count++;
                System.out.println(a);
            }
        }
        System.out.println("files in directory : "+count);
        System.out.println("------------to display only files in directory------------------");

    }
}
