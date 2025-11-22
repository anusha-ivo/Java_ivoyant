package threads;

public class Custom_exce_1 {
    public static void main(String[] args){
        try{
            throw new MyOwnException(10);
        }
        catch(MyOwnException e){
            System.out.println(e.toString());
        }
    }
}
class MyOwnException extends Exception{
    int a;

    public MyOwnException(int a) {
        this.a = a;
    }
    public String toString(){
        return  " " +a;
    }
}

