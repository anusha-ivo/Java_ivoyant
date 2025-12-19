import java.util.Scanner;

public class Three_dim_arra {
        public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            System.out.println("enter  layers n rows n colums :");
            int [][][] a=new int[s.nextInt()][s.nextInt()][s.nextInt()];
            System.out.println("enter the elements  :");
            for(int i=0;i<a.length;i++) {
                for (int j= 0; j < a[i].length; j++)
                    for (int k= 0; k < a[i][j].length; k++) {
                    a[i][j][k] = s.nextInt();
                }
            }
            System.out.println("array elements  are :");
            for(int i=0;i<a.length;i++) {
                for (int j = 0; j < a[i].length; j++) {
                    for (int k = 0; k < a[i][j].length; k++) {
                        System.out.println(a[i][j][k]);

                    }
                }
            }

        }
    }


