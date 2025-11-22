package week3;

import java.io.*;

public class Object_graph {
    public static void main(String[] args)throws Exception{
        Dog d=new Dog();
        FileOutputStream f=new FileOutputStream("n_objects.txt");
        ObjectOutputStream o=new ObjectOutputStream(f);
        o.writeObject(d);
        FileInputStream f2=new FileInputStream("n_objects.txt");
        ObjectInputStream o2=new ObjectInputStream(f2);
        Dog d2=(Dog) o2.readObject();
        System.out.println(d2.c.r.j);



    }
}
class Dog implements Serializable {
    Cat c=new Cat();
}
class Cat implements Serializable{
    Rat r=new Rat();
}
class Rat implements Serializable{
    int j=10;
}
