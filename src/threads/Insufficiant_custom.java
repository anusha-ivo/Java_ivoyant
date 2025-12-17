package threads;

public class Insufficiant_custom {
    public static void main(String[] args){
        try{
            throw new InsufficiantFund(100000);
        }
        catch (InsufficiantFund e){
            System.out.println(e.toString());
        }
    }

}
class InsufficiantFund extends Exception{
    int a;

    public InsufficiantFund(int a) {
        this.a = a;
    }
    public String toString(){
        return " amout is insufficiant : "+a;
    }
}
