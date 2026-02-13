package week3;

import java.io.*;

public class Cus_4 {
    public  static void main(String[] args) throws Exception{
        T4 t=new T4();
        FileOutputStream f=new FileOutputStream("t4.txt");
        ObjectOutputStream o=new ObjectOutputStream(f);
        o.writeObject(t);
        FileInputStream f2=new FileInputStream("t4.txt");
        ObjectInputStream o2=new ObjectInputStream(f2);
        T4 t2 =(T4)o2.readObject();
        System.out.println(t2.s+" "+t2.n);

    }
}
class T4 implements Serializable {
     transient String s="anu";
     transient int n=10;
     private void writeObject(ObjectOutputStream oo)throws Exception{
         oo.defaultWriteObject();
         String snew="123"+s;
         int nnew=123+n;
         oo.writeObject(snew);
         oo.writeInt(nnew);
     }
     private void readObject(ObjectInputStream oi)throws Exception{
         oi.defaultReadObject();
         String snew1=(String) oi.readObject();
         s=snew1.substring(3);
         int nnew1=oi.readInt();
         n=nnew1-123;
     }
}
