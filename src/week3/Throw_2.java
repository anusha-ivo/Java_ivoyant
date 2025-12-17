package week3;

public class Throw_2 {
    public static void main(String[] args){
        A a=new A();
        a.dis(12)
        ;
       // a.dis(12);

    }
}
class A{
    void dis(int age){
        if(age<18){
            throw new ArrayIndexOutOfBoundsException("age is invalid");
        }
        System.out.println("eligible to vote");
    }
}
