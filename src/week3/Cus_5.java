package week3;

import java.io.*;

public class Cus_5 {
    public static void main(String[] args) throws Exception{
    Cu c=new Cu();
        FileOutputStream f=new FileOutputStream("c5.txt");
        ObjectOutputStream o=new ObjectOutputStream(f);
        o.writeObject(c);
        FileInputStream f2=new FileInputStream("c5.txt");
        ObjectInputStream o1=new ObjectInputStream(f2);
       Cu c2 =(Cu)o1.readObject();
       System.out.println(c2.s+" " +c2.a);

    }
}
class Cu implements Serializable {
    transient String s="anu";
    transient int  a=20;
    private void writeObject(ObjectOutputStream oo) throws Exception{
        oo.defaultWriteObject();
        String s1="123"+s;
        int a1=123+a;
        oo.writeObject(s1);
        oo.writeInt(a1);

    }
    private void readObject(ObjectInputStream oi)throws Exception{
        oi.defaultReadObject();
        String snew=(String) oi.readObject();
        s=snew.substring(3);
        int a1new=oi.readInt();
        a=a1new-123;
    }


}
