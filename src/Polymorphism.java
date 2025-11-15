public class Polymorphism {
    public static void main(String[] args){
        School s=new Classroom();
        s.dis1();
        s.dis();

    }
}
class School{
    void dis1(){
        System.out.println("students are there");
    }
    void dis(){
        System.out.println("students are in School ");
    }
}
class Classroom extends School{
    void dis(){
        System.out.println("students are in classrooms");//overidden by child,all child methods should present in parent then only by polymorphism we access the methods
    }
}
