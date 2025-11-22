package threads;

public class Age_custom {
    public static void main(String[] args){
        try{
            throw new AgeNotValid(12);
        }
        catch ( AgeNotValid e){
            System.out.println(e.toString());
        }
    }
}
class  AgeNotValid extends Exception{
    int a;

    public AgeNotValid(int a) {
        this.a = a;
    }
    public String toString(){
        return " age is not valid "+a;
    }
}
