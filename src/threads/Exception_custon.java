package threads;

public class Exception_custon {
    public static void main(String[] args){
        int age=12;
        if (age < 18) {

            try {
                throw new AgeNotValid(age);
            } catch (AgeNotValid e) {
                System.out.println(e.toString());

            }
        }


    }
}
class AgeNotValid extends Exception{
  int age;

    public AgeNotValid(int age) {
        this.age = age;
    }
    public String toString(){
        return "age is not valid" +age;
    }
}
