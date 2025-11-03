public class Search_array {
    public static void main(String[] args){
        int a[]={1,3,5,6};
        int k=3;
        for(int i=0;i<a.length;i++) {
            if (k == a[i]) {
                System.out.println("key is found at :" + i);
                return;

            }
        }

          System.out.println("key is not found");



    }
}
