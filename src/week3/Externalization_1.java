package week3;

import java.io.*;

public class Externalization_1 {
    public static void main(String[] args) throws Exception{
        E e=new E("anu",21,45);
        FileOutputStream f=new FileOutputStream("e.txt");
        ObjectOutputStream o=new ObjectOutputStream(f);
        o.writeObject(e);
        FileInputStream f2=new FileInputStream("e.txt");
        ObjectInputStream o2=new ObjectInputStream(f2);
        E e2=(E)o2.readObject();
        System.out.println(e2.name+" "+e2.roll+" "+e2.age);



    }
}
class E implements Externalizable {
    String name;
    int age;
    int roll;
 public E(){
     System.out.println("0 parameterized ");

}
    public E(String name, int age,int roll) {
        this.name = name;
        this.age = age;
        this.roll=roll;
    }
    public void writeExternal(ObjectOutput oo)throws IOException{
     oo.writeObject(name);
        oo.writeInt(age);
    }
    public void readExternal (ObjectInput oi)throws IOException, ClassNotFoundException{
        name=(String) oi.readObject();
        age=oi.readInt();
    }
}
