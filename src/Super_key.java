
public class Super_key {
    public static void main(String args[]){
        Stu s=new Stu("anu",24);


    }
}
class Persons{
    String age;
    int names;
    Persons(){
        System.out.println("o parameterized");
    }
}
class Stu extends Persons{
    String name;
    int age;
    Stu(String name,int age){
        super();
        this.name=name;
        this.age=age;
        System.out.println("2 parameterized");
        System.out.println(name);
        System.out.println(age);

    }
}
