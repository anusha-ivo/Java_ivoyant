package week3;

public class Multiple_catch_block {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("not divided by 0");
        }
    }
}
