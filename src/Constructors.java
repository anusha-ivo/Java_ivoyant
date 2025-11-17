public class Constructors {
    String name;
    int age;
    Constructors(String name,
    int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("name is: "+name);
        System.out.println("age is: "+age);

    }
}
class Con{
    public static void main(String[] args){
        Constructors c=new Constructors("bhoo",21);
        c.display();

    }
}
