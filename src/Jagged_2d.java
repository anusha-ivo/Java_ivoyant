
   // package array_project;

import java.util.Scanner;

    public class Jagged_2d {
        public static void main(String args[]) {
            Scanner s=new Scanner(System.in);
            System.out.println("enter num of rows : ");
            int n=s.nextInt();
            int[][] a=new int[n][];
            for(int i=0;i<a.length;i++) {
                System.out.println("enter num of colums in" +(i+1)+ "rows : ");
                a[i]=new int[s.nextInt()];
            }
            System.out.println("enter elements  : ");
            for(int i=0;i<a.length;i++) {
                for(int j=0; j<a[i].length;j++) {
                    a[i][j]=s.nextInt();
                }
            }
            System.out.println("-------------elements ---------------------- : ");
            for(int i=0;i<a.length;i++) {
                for(int j=0; j<a[i].length;j++) {
                    System.out.println(a[i][j]);
                }
            }



        }

    }


