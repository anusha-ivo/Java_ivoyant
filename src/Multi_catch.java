public class Multi_catch {
    public static void main(String[] args){
        try{
            System.out.println(10/0);
            String a="anu";
            System.out.println(a);

        }
        catch (ArithmeticException | NullPointerException e){
            System.out.println("catching");
        }
    }
}
