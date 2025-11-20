public class Exception_2 {
    public static void main(String[] args){
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException e){
            System.out.println("arithematic exceptions");
        }
        catch (Exception e){
            System.out.println("arithematic exceptions");// we  must first declare generic exceptions at last only
        }//else it will give error

    }
}
