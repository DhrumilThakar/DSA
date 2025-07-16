/*When function call Itself it is know as recursion until a condition is satisfied. */
public class name {
    public static void printName(int n){
        if(n==0){
            return;
        }
        System.out.println("Dhrumil Thakar");
        printName(n-1);
    }
    public static void main(String[] args) {
        printName(10);
    }
}
