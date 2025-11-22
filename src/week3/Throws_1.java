package week3;

public class Throws_1 {
    public static void main(String[] args) throws Exception{
Thr t=new Thr();
t.dis();
    }

}
class Thr{
    void dis() throws Exception{
try {
    System.out.println(10 / 0);
} catch (Exception e) {
    System.out.println("not divided by 0");
   throw  e;
}

        }
    }

