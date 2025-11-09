import java.awt.*;
import java.util.Arrays;

public class Array_Sort_wb {
    public static void main(String args[]){
        int[] a={40,24,56,2};
        for(int i=0;i<a.length-1;i++){// one pass should less than n so length-1
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
        } for(int i=0;i<a.length-1;i++) {
            System.out.println(a[i]);
        }
        System.out.println("arrays after sorting : "+ Arrays.toString(a));
        for(int i=0;i<a.length-1;i++){// one pass should less than n so length-1
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]<a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
        }
        System.out.println("array decending  sorting : "+ Arrays.toString(a));

    }
}
