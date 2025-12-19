import java.util.Scanner;

public class Multi {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int[][]a =new int[2][2];
        int[][]a2 =new int[2][2];
        int[][]a3 =new int[2][2];
        int [][] t=new int[2][2];
        System.out.println("enter the elements of a matrix : ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("enter the elements of a2 matrix : ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a2[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<a.length;i++){

            for(int j=0;j<a.length;j++){
                a3[i][j]=0;
                for(int k=0;k<a.length;k++)
               a3[i][j]+=a[i][k]* a2[k][j];
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.println(a3[i][j]);
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
               t[i][j]=a[j][i];
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.println(t[i][j]);
            }
        }

    }
}
