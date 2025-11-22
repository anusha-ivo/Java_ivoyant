import java.util.Scanner;

public class Two_D {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter rows n colums :");
        int [][] a=new int[s.nextInt()][s.nextInt()];
        System.out.println("enter the elements  :");
        for(int i=0;i<a.length;i++) {
            for (int j= 0; j < a[i].length; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("array elements  are :");
        for(int i=0;i<a.length;i++) {
            for (int j= 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);

            }
        }

    }
}
