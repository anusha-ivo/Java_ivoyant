public class Method_overloading {
    void cofee(int a){
        System.out.println("you ardered "+a +"coffees");
    }
    void cofee(int a,String name){
        System.out.println("you ardered "+a +"coffees"+"and name is "+name);
    }
    void cofee(double b){
        System.out.println("you ardered cost of  "+b +"coffees");
    }

}
class Co{
    public static void main(String args[]){
        Method_overloading m= new Method_overloading();
        m.cofee(4);
        m.cofee(2,"capaccino");
        m.cofee(200.22);

    }
}
