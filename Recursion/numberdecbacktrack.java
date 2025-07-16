public class numberdecbacktrack {
    public static void printNumber(int i,int target){
        if(i>target){
            return;
        }
        printNumber(i+1, target);
        System.out.println(i);
    }
  public static void main(String[] args) {
    printNumber(1,10);
  }  
}
