package week3;

import java.io.*;

public class Transient_key {
    public static void main(String[] args)throws Exception{
        Tra t=new Tra();
        FileOutputStream f=new FileOutputStream("transient.txt");
        ObjectOutputStream o=new ObjectOutputStream(f);
        o.writeObject(t);
        FileInputStream f1=new FileInputStream("transient.txt");
        ObjectInputStream o1=new ObjectInputStream(f1);
      Tra t2 =(Tra) o1.readObject();
      System.out.println(t2.i+ " " +t2.j);

    }
}
class Tra implements Serializable {
    int i=10;
    transient int j=20;
}
