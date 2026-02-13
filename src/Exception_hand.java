import java.util.Scanner;

public class Exception_hand {
    public static void main(String args[]){
        try{
        Scanner s=new Scanner(System.in);
        System.out.println("enter the numerator");
        int a=s.nextInt();
        System.out.println("enter the denominator");
        int b=s.nextInt();
        int c=a/b;
        System.out.println("result is: "+c);
        }
        catch (Exception e){
            System.out.println("denominator not be 0");

        }
        System.out.println("program terminated");


    }
}
