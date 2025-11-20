public class Exa_2 {
    public static void main(String[] args){


        Bags b=new Bags("new",245.6,23);
        b.dis();

    }
}
class Bag {
    String name;
    double price;

    Bag(String name, double price) {
        System.out.println("by child super word ");
        this.name = name;
        this.price = price;
    }
    void dis(){
        System.out.println(name);
        System.out.println(price);
    }
}
class Bags extends Bag{
    int count;
    Bags(String name, double price,int count){
        super(name,price);
        this.count=count;
    }
}
