public class Logical_operations {
    public static void main(String args[]){
        int a=10;
        int b=15;
        System.out.println("checking using and operator : "+((a>5)&&(b<20)));
        System.out.println("checking using and operator : "+((a>15)&&(b<20)));
        System.out.println("checking using or operator : "+((a>5)||(b>20)));
        System.out.println("checking using or operator : "+((a<5)||(b<20)));
        System.out.println("checking using not operator : "+!(a<b));
    }
}
