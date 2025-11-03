public class method_overriding {
    void study(){
        System.out.println("am studying");
    }

}
 class Person extends method_overriding{
     void study(){
         System.out.println(" anushaa is  studying");
     }
}
class S{
    public static void main(String[] args){
        Person m=new Person ();
        m.study();//overridden by child class

    }
}
