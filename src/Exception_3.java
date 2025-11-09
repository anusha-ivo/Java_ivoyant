public class Exception_3 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(10 / 0);
            } catch (Exception e) {
                System.out.println("generic ");
            } finally {
                System.out.println("finally block");
            }
            System.out.println("inside try");
        }
        catch (Exception e) {
            System.out.println("generic  exception outside  ");
        }
        finally {
            System.out.println("outside try block");
        }



    }
}
