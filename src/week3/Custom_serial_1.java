package week3;

import java.io.*;

public class Custom_serial_1 {
    public static void main(String[] args) throws Exception{
        T1 t=new T1();
        FileOutputStream f=new FileOutputStream("tra_1.txt");
        ObjectOutputStream o=new ObjectOutputStream(f);
        o.writeObject(t);
        FileInputStream f2=new FileInputStream("tra_1.txt");
        ObjectInputStream o2=new ObjectInputStream(f2);
        T1 t2=(T1)o2.readObject();
        System.out.println(t2.a+" "+t2.b);

    }
}
class T1 implements Serializable {
    transient String a="anu";
    int b=10;
    private void writeObject(ObjectOutputStream oo) throws Exception{
        oo.defaultWriteObject();
        String anew="123"+a;
        oo.writeObject(anew);
    }
    private void readObject(ObjectInputStream oi)throws Exception{
        oi.defaultReadObject();
        String anew1= (String)oi.readObject();
        a=anew1.substring(3);
    }
}
