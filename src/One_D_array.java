import java.util.Scanner;

public class One_D_array
{
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int[] a=new int[s.nextInt()];
        System.out.println("enter the elements of array : ");
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<a.length;i++) {
            System.out.println("elements  of array : " +a[i]);

        }

    }
}
