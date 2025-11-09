public class Throw_2 {
   // static ArithmeticException e=new ArithmeticException();

    public static void main(String[] args){
         ArithmeticException e=new ArithmeticException();// static inside the method is not posiible so
        ArithmeticException e1;
        throw e;
       // throw e1;//not possible throw after throw or any statments

    }
}
