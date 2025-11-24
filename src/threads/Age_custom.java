package threads;

public class Age_custom {
    public static void main(String[] args){
        try{
            throw new AgeNotValid_1(12);
        }
        catch ( AgeNotValid_1 e){
            System.out.println(e.toString());
        }
    }
}
class  AgeNotValid_1 extends Exception{

    int a;

    public AgeNotValid_1(int a) {
        this.a = a;
    }
    public String toString(){
        return " age is not valid "+a;
    }
}
