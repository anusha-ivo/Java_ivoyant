package week3;

import java.io.FileNotFoundException;

public class Throw_1 {
    public static void main(String[] args){
       try{
            throw  new ArithmeticException("custom");
            //System.out.println("hi");unreachable code
       }
        catch (ArithmeticException e){
            System.out.println(e);
        }


    }
}
