
    //package array_project;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

    public class Array_practice {
        public static void main(String args[]) {
            Scanner s=new Scanner(System.in);
            float sum=0;
            System.out.println("enter array size");
            int n=s.nextInt()
                    ;		Integer[] a=new Integer[n];
            System.out.println("enter array elements");
            for(int i=0;i<a.length;i++) {
                a[i]=s.nextInt();
            }
            System.out.println(" array elements");
            for(int i=0;i<a.length;i++) {
                System.out.println(a[i]);
            }
            for(int i=0;i<a.length;i++) {
                sum+=a[i];
            }
            System.out.println(" array elements sum");

            System.out.println(sum);

            float avg=sum/(n);
            System.out.println(avg);
            int min=a[0];
            for(int i=0;i<a.length;i++) {
                if(min>a[i]) {
                    min=a[i];
                }
            }	System.out.println("min elemnet is "+min );
            int max=a.length-1;
            for(int i=0;i<a.length;i++) {

                if(max<a[i]) {
                    max=a[i];
                }
            }
            System.out.println("max elemnet is " +max );
            Arrays.sort(a);
            System.out.println(Arrays.toString(a));
            System.out.println("sorting in reverse order" );
            Arrays.sort(a,Collections.reverseOrder());// use integer rather than int
            System.out.println(Arrays.toString(a));
            System.out.println("--------------------------------------------------------------------------" );

            for(int i=0;i<a.length-1;i++) {


                for(int j=0;j<a.length-i-1;j++) {
                    if(a[j]>a[j+1]) {
                        int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;



                    }

                }
            }
            System.out.println("using builtin"+Arrays.toString(a));




        }
    }




