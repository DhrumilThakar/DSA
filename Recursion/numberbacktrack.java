public class numberbacktrack {
    public static void printNumber(int i){
        if(i<1){
            return;
        }
        printNumber(i-1);
        System.err.println(i);
    }
   public static void main(String[] args) {
    printNumber(10);
   } 
}