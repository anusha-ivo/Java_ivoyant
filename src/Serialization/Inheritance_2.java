package Serialization;

import java.io.*;

public class Inheritance_2 {
    public static void main(String[] args) throws Exception{
        An a=new An();
        FileOutputStream f=new FileOutputStream("inheri_2");
        ObjectOutputStream o=new ObjectOutputStream(f);
        o.writeObject(a);
        FileInputStream f2=new FileInputStream("inheri_2");
        ObjectInputStream o2=new ObjectInputStream(f2);
       An a3 =(An)o2.readObject();
       System.out.println(a3.i+" "+a3.s);

    }
}
class Animal{
    int i=10;
    Animal(){
        System.out.println("this is parent constructor");
    }
}
class An extends Animal implements Serializable {
    String s="arun";
}
