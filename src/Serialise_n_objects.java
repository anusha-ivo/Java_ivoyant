import java.io.*;

public class Serialise_n_objects {
    public static void main(String[] args) throws Exception{
       A aobj=new A();
       B bobj=new B();
       System.out.println("before Serialization:"+aobj.a+" "+aobj.a2);
        FileOutputStream f=new FileOutputStream("mul_obj.txt");
        ObjectOutputStream o=new ObjectOutputStream(f);
        o.writeObject(aobj);
        o.writeObject(bobj);
        System.out.println(" desirialization:");
        FileInputStream f2=new FileInputStream("mul_obj.txt");
        ObjectInputStream o2=new ObjectInputStream(f2);
        A anew=(A)o2.readObject();
        B bnew=(B)o2.readObject();
        System.out.println("after Serialization:"+aobj.a+" "+aobj.a2);


    }
}
class A implements Serializable {
    int a=10;
    int a2=12;
}
class B implements Serializable{
    int b=20;
    int b2=15;
}
