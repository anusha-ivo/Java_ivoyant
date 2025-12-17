package week3;

public class Abstraction {
    public static void main(String[] args){
        Raksha r=new Sin();
        r.teach();
        r.talk();
        ((Sin)(r)).sintalk();

    }
}
abstract class Raksha{
    public abstract void teach();
    void talk(){
        System.out.println("raksha talking");
    }
}
class Sin extends Raksha{

 public void teach() {
     System.out.println("this is implementation by child class");
 }
     void sintalk(){
         System.out.println("sin is  talking");
     }
}
