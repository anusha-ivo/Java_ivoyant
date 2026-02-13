package week3;

import java.io.*;

public class Custom_3 {
    public static void main(String[] args)throws Exception{
        T3 t=new T3();
        FileOutputStream f=new FileOutputStream("t3.txt");
        ObjectOutputStream o=new ObjectOutputStream(f);
        o.writeObject(t);
        FileInputStream f1=new FileInputStream("t3.txt");
        ObjectInputStream o1=new ObjectInputStream(f1);
        T3 t1=(T3)o1.readObject();
        System.out.println(t1.s+" "+t1.s1);


    }
}
class T3 implements Serializable{
    transient String s="Anu";
    transient int s1=12;
    private void writeObject(ObjectOutputStream o)throws Exception
    {
        o.defaultWriteObject();
        String snew="123"+s;
        int s1new=123+s1;
        o.writeObject(snew);
        o.writeInt(s1new);

    }
    private void readObject(ObjectInputStream oi)throws Exception{
        oi.defaultReadObject();
       String snew2=(String) oi.readObject();
       s=snew2.substring(3);
        int snew3= oi.readInt();
        s1=snew3-123;


    }

}
