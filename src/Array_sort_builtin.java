import java.util.Arrays;
import java.util.Collections;

public class Array_sort_builtin {
    public static void main(String[] args){
        Integer a[]={20,80,3,1};
        System.out.println("arrays before sorting : "+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("arrays after sorting : "+ Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("arrays after reverse sorting : "+ Arrays.toString(a));
    }
}
