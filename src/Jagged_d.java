import java.util.Scanner;

public class Jagged_d {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a[][]=new int[3][];
        for(int i=0;i<a.length;i++) {
            System.out.println("enter the colums in row " +(i+1) );
            a[i]=new int[s.nextInt()];

        }
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = s.nextInt();
            }
        }
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }
        }







    }
}
