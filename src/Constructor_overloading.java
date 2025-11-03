public class Constructor_overloading {
    String name;
    int age;
    Constructor_overloading( String name){
        this.name=name;
        age=23;
    }
    Constructor_overloading( String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);

    }

}
class Cons{
    public static void main(String[] args){
        Constructor_overloading c=new Constructor_overloading("anu");
        c.display();
        Constructor_overloading c2=new Constructor_overloading("anu",24);
        c2.display();

    }
}
