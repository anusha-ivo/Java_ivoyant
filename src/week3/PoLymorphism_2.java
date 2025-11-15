package week3;

public class PoLymorphism_2 {
    public static void main(String[] args) {
        ScienceTe s = new ScienceTe();//upcasting

        helper(s);
        MathTe m = new MathTe();
        helper(m);
    }

    public static void helper(Teacher t) {//helper method should static n declare outside main method but inside class
        t.teach();
        t.attendence();


    }
}

class Teacher{
    void teach(){
        System.out.println("teacher is teaching");
    }
    void attendence(){
        System.out.println("teacher is taking attendence");
    }
}
class ScienceTe extends Teacher{
    void teach(){
        System.out.println(" Science teacher is teaching");
    }
    void attendence(){
        System.out.println(" Science teacher is taking attendence");
    }
}

class MathTe extends Teacher{
    void teach(){
        System.out.println("  Math teacher is teaching");
    }
    void attendence(){
        System.out.println(" Math teacher is taking attendence");
    }
}
