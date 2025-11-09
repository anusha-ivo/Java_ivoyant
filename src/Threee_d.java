import java.util.Scanner;

public class Threee_d {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter layers :");
        int n=s.nextInt();
        System.out.println("enter rows :");
        int m=s.nextInt();
        System.out.println("enter colums :");
        int o=s.nextInt();
        int[][][] a=new int[n][m][o];
        System.out.println("enter elements");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    a[i][j][k]=s.nextInt();
                }

            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    System.out.println(a[i][j][k]);
                }

            }
        }




    }
}
