package week3;

public class finalise {
    public static void main(String[] args){
        Ravi r=new Ravi(22,"aby");
        r=null;//when object is null then only it call finalize method
        System.gc();
    }
}
class Ravi{
    int a;
    String s;

    public Ravi(int a, String s) {
        this.a = a;
        this.s = s;
    }
     public void finalize(){
        System.out.println("cleaned");
    }
}
