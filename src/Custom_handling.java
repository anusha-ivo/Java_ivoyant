import java.util.Scanner;

public class Custom_handling {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter n : ");
        int n=s.nextInt();
        if(n>60){
            throw new TooOldExceptions("age get older");
        } else if (n<18) {
            throw new TooYoungExceptions("age not matches");

        }
        else{
            System.out.println("thankyou");
        }

    }
}
class TooYoungExceptions extends RuntimeException{
    TooYoungExceptions(String s){
        super(s);
    }
}
class TooOldExceptions extends RuntimeException{
    TooOldExceptions(String s){
        super(s);
    }
}
