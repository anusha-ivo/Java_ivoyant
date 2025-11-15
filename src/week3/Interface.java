package week3;

public class Interface {
    public static void main(String[] args){
        Hemi h=new Tilak();
        h.attendence();
        h.talk();
        Hemi.sleep();

    }
}
 interface Hemi{
    void talk();//by default public abstract declaration
    void attendence();
    static void sleep(){//concrete methods
        System.out.println("hemi is sleeping");
    }

}
class Tilak implements Hemi{
   public void talk(){
        System.out.println("tilak talking");
    }
     public void attendence(){
        System.out.println("tilak taking attendence");
    }
}
