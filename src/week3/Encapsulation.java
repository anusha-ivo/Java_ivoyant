package week3;

public class Encapsulation {
    public static void main(String[] args){
        Anil a=new Anil();
        a.setName("anil kumar");
        a.setAge(22);
        System.out.println(a.getAge());
        System.out.println(a.getName());
        a.getAge1();

    }
}
class Anil {
    String name;
    int age;

    public void setName(String y) {//setter
        name = y;
    }

    public void setAge(int x) {
        age = x;
    }

    public String getName() {
        return name;
    }
//getter
    public int getAge() {
        return age;
    }
    public void getAge1(){
        System.out.println(age);
    }
}