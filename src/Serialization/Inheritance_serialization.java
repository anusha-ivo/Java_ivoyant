package Serialization;

import java.io.*;

public class Inheritance_serialization {
    public static void main(String[] args)throws  Exception{
        Student s=new Student();
        FileOutputStream f=new FileOutputStream("inheritance_1.txt");
        ObjectOutputStream o=new ObjectOutputStream(f);
        o.writeObject(s);
        FileInputStream f2=new FileInputStream("inheritance_1.txt");
        ObjectInputStream o2=new ObjectInputStream(f2);
        Student s2 =(Student)o2.readObject();
        System.out.println(s2.name+" "+s2.roll);

    }
}
class Person implements Serializable {
    String name="anu";
}
class Student extends Person{
    int roll=20;
}
