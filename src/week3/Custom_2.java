package week3;

import java.io.*;

public class Custom_2 {
    public static void main(String[] args)throws Exception{
        Tr t=new Tr();
        FileOutputStream f=new FileOutputStream("t2.txt");
        ObjectOutputStream o=new ObjectOutputStream(f);
        o.writeObject(t);
        FileInputStream f2=new FileInputStream("t2.txt");
        ObjectInputStream o2=new ObjectInputStream(f2);
       Tr t2 =(Tr)o2.readObject();
       System.out.println(t2.k+ " "+t2.i);

    }
}
class Tr implements Serializable {
    transient String k="bhoo";
    int i=22;
    private void writeObject(ObjectOutputStream oo) throws Exception{
        oo.defaultWriteObject();
        String knew ="123"+k;
        oo.writeObject(knew);

    }
    private void readObject(ObjectInputStream oi)throws Exception{
        oi.defaultReadObject();
        String knew2=(String)oi.readObject();
        k=knew2.substring(3);

    }
}
