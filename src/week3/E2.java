package week3;

import java.io.*;

public class E2 {
    public static void main(String[] args) throws Exception{
        Ee e=new Ee("name",21,34);
        FileOutputStream f=new FileOutputStream("e.txt");
        ObjectOutputStream o=new ObjectOutputStream(f);
        o.writeObject(e);
        FileInputStream f1=new FileInputStream("e.txt");
        ObjectInputStream o2=new ObjectInputStream(f1);
        Ee e2 =(Ee)o2.readObject();
        System.out.println(e2.name+" "+e2.age+" "+e2.roll);


    }
}
class Ee implements Externalizable {
    String name;
    int age;
    int roll;
    public Ee(){
        System.out.println("this is o parameterised cons");
    }

    public Ee(String name, int age,int roll) {
        this.name = name;
        this.age = age;
        this.roll=roll;
    }
    public void writeExternal(ObjectOutput oo) throws IOException{
        oo.writeObject(name);
        oo.writeInt(age);

    }
    public void readExternal(ObjectInput oi)throws IOException,ClassNotFoundException{
        name=(String) oi.readObject();
        age=oi.readInt();
    }
}

