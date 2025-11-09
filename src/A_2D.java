import java.util.Arrays;
import java.util.Scanner;

    public class A_2D{
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("enter num of rows");
            int n=s.nextInt()
                    ;
            System.out.println("enter num of columns");
            int m=s.nextInt()
                    ;
            int[][] a=new int[n][m];
            System.out.println("enter elements");
            for(int i=0;i<a.length;i++) {
                for(int j=0;j<a[i].length;j++) {
                    a[i][j]=s.nextInt();
                }

            }
            System.out.println("array elements are :");
            for(int i=0;i<a.length;i++) {
                for(int j=0;j<a[i].length;j++) {
                    System.out.println(a[i][j]);
                }

            }
            int min=a[0][0];
            for(int i=0;i<a.length;i++) {
                for(int j=0;j<a[i].length;j++) {
                    if(min>a[i][j]) {
                        min=a[i][j];


                    }

                }

            }
            System.out.println(" min element is : "+min);
            System.out.println("max elements : ");
            int max=a[0][0];
            for(int i=0;i<a.length;i++) {
                for(int j=0;j<a[i].length;j++) {
                    //max[a.length-1][a.length-1];
                    //int max=[][];
                    if(max<a[i][j]) {
                        max=a[i][j];


                    }


                }
            }
            System.out.println(" max element is : "+max);
            for(int i=0;i<a.length;i++) {
                Arrays.sort(a[i]);
            }
            System.out.println("sorting in builtin methods : "+Arrays.deepToString(a));


        }

    }


