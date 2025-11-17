package week3;

import java.io.*;

public class Cust_5 {
    public static void main(String[] args)throws Exception{
        Cuu c=new Cuu();
        FileOutputStream f=new FileOutputStream("cust_5.txt");
        ObjectOutputStream o=new ObjectOutputStream(f);
        o.writeObject(c);
        FileInputStream f1=new FileInputStream("cust_5.txt");
        ObjectInputStream o1=new ObjectInputStream(f1);
        Cuu o2=(Cuu)o1.readObject();
        System.out.println(o2.a+" " +o2.s);

    }
}
class  Cuu implements Serializable {
    transient String s="anu";
    transient int a=10;

private void writeObject(ObjectOutputStream oo) throws Exception{
    oo.defaultWriteObject();
    String snew="123"+s;
    int anew=123+a;
    oo.writeObject(snew);
    oo.writeInt(anew);


}
private void readObject(ObjectInputStream oi)throws Exception{
    oi.defaultReadObject();
    String snew1=(String) oi.readObject();
    s=snew1.substring(3);
    int anew1=oi.readInt();
    a=anew1-123;


}
    }
