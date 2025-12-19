package mapInterface;

import java.util.StringTokenizer;

public class StringTokenizier_1 {
    public static void main(String[] args) {
        StringTokenizer s = new StringTokenizer("anusha he hello");
        while (s.hasMoreTokens()) {
            System.out.println(s.nextToken());
        }
    }
}
