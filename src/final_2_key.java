public class final_2_key {
    public static void main(String[] args){
        Shifa s=new Shifa();
        s.sleep();

    }
}
class Reddy{
    int i=10;
    void talk(){
        System.out.println("reddy is talking");
    }
}
class Shifa extends Reddy{
    int j=90;

    void sleep(){
        System.out.println("reddy is sleeping");
        System.out.println(j);
        System.out.println(super.i);
        super.talk();//super keyword always inside method or constructors

    }
}
