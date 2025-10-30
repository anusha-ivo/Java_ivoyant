public class Loops_java {
    public static  void main(String args[]){
        for(int i=0;i<=10;i++){
            System.out.println("using for loop ");
            System.out.println(i);
        }
        System.out.println("using while loop ");
        int j=1;
        while(j<10){
            System.out.println(j);
            j++;
        }
        System.out.println("completion of while loop");
        System.out.println("using  do-while loop ");
        int a=2;
        do{
            System.out.println(20);
            System.out.println(a);
             a++;

        }while(a<10);
        System.out.println("completion of do-while");

        int[] c={10,20,30};
       for(int x:c){
           System.out.println(x);//enhanced loop
       }


    }
}
