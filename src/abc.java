public class abc {

    public static void Main(String[] args){
        Su s=new Su();
        s.Dis();



    }
}
class Su {
    int sum = 0;

    void Dis() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {

                sum += i;
                int a=5;
                int b=a++;
                int c=++a;


            }
        }
        System.out.println("sum is : " + sum);
    }
}
