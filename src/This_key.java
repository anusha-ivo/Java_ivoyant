public class This_key {
    public static void main(String[] args){
        Thiss t=new Thiss();


    }
}

class Thiss{
    String name;
    int age;
    Thiss(){
        this("anu",23);
        System.out.println("zero parameterizes constructor");
    }
    Thiss(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("one parameterizes constructor");
        System.out.println(name +age);
    }

}