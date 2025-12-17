package week3;

public class Down_casting {
    public static void main(String[] args) {
        Sneha i = new Impa();
        helper(i);
        i.dis();
       ((Impa)(i)).dis1();//downcasting


        Sneha p = new Pal();
        helper(p);
       p.dis();
        ((Pal)(p)).dis2();
        ((Pal)(p)).dis3();//douncasting

    }

        public static void helper(Sneha s){
            s.dis();//write only overriden methods

            if(s instanceof Impa){
                ((Impa)(s)).dis1();
            }
            else if(s instanceof Pal){
                ((Pal)(s)).dis2();//only child specific
                ((Pal)(s)).dis3();
            }
        }

    }

class Sneha{
    void dis(){
        System.out.println("sneha is teaching : ");
    }
}
class Impa extends Sneha{
    void dis(){
        System.out.println("Impa is teaching : ");
    }
    void dis1(){
        System.out.println("Impa is teaching  with extra class: ");
    }
}
class Pal extends Sneha{
    int i=10;
    void dis3() {
        System.out.println(i);
    }
    void dis(){
        System.out.println("Pallavi is teaching : ");
    }
    void dis2(){
        System.out.println("Pallavi is teaching  with extra class with  more interest: ");
    }
}
