public class Inheritance {
    String name;

    void write() {
        System.out.println("writing");
    }
}
    class Students extends Inheritance{
        int age;
        void study(){
            System.out.println("studying");


        }
    }
class M{
    public static void main(String args[]){
        Students s=new Students();
        s.name="anu";
        s.age=23;
        System.out.println(s.name);
        System.out.println(s.age);
        s.study();
        s.write();
    }
}
