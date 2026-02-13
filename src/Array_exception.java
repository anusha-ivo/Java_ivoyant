import java.util.Scanner;

public class Array_exception {
    public static void main(String[] args){
        try{
        Scanner s= new Scanner(System.in);
        System.out.println("enter n value");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("enter elements : ");

        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.println("enter index to retriev value");
        int m=s.nextInt();
        System.out.println(" value :"+a[m]);}
        catch (Exception e){
            System.out.println("enter valid index");
        }




    }
}
