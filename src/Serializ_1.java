import java.io.*;

public class Serializ_1 {
    public static void main(String[] args)throws Exception{
        Pers p=new Pers();
        System.out.println("before serialization : ");
        FileOutputStream f=new FileOutputStream("serial_1.txt");
        ObjectOutputStream o=new ObjectOutputStream(f);
        o.writeObject(p);
        FileInputStream f2=new FileInputStream("serial_1.txt");
        ObjectInputStream o2=new ObjectInputStream(f2);
        Pers p2 =(Pers) o2.readObject();
        System.out.println(p2.name+" "+p2.age);



    }
}
class Pers implements Serializable {
    String name="anu";
    int age=20;
}

