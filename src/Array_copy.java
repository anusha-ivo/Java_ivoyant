import java.util.Arrays;
import java.util.Scanner;

public class Array_copy {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int[] a=new int[3];
        int[] a2=new int[a.length];
        System.out.println("enter elements : ");
        for(int i=0;i<a.length;i++){
           a[i]=s.nextInt();
        }

        for(int i=0;i<a.length;i++){
            a2[i]=a[i];
        }
        for(int i=0;i<a.length;i++){
         System.out.println(a2[i]);
        }
        System.out.println("-----------------using built in----------------------");
        Arrays.copyOf(a,a.length);
        System.out.println(Arrays.toString(a));


    }
}
