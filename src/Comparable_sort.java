public class Comparable_sort implements Comparable<Comparable_sort> {
    String name;
    int rollNo;
    double per;
     public Comparable_sort( String name,
    int rollNo,
    double per){
         this.name=name;
         this.rollNo=rollNo;
         this.per=per;
     }
     public String toString(){
         return " name ="+name+",rollNo="+rollNo+",per="+per+",";
     }
     public int compareTo(Comparable_sort c){
        //downcast
         if(c.rollNo<this.rollNo){
             return 1;
         } else if (c.rollNo>this.rollNo) {
             return -1;

         }
         else{
             return 0;
         }


     }



}
