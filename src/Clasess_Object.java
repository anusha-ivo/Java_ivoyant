public class Clasess_Object {
    String name;
    int age;
    void display(){
        System.out.println("name is "+ name);
        System.out.println("age is "+ age);
    }

}
class Aa{
    public static void main(String[] args){
        Clasess_Object o=new Clasess_Object();
        o.name="anu";
        o.age=22;
        o.display();


    }
}
