package week3;

public class Co_variant {
    public static void main(String[] args){
        Bhoo b=new Bhoo();
        b.dis();

    }
}
class Anu{
   Anu dis(){//method name starts with class name and return type also classname
        System.out.println("parent");
        return new Anu();
    }
}
class Bhoo extends Anu{
   Bhoo dis(){
        System.out.println("child");//covariant the return type different but also we get output
        return new Bhoo();
    }
}
