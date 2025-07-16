
public class numberAssending {
    public static void printNumber(int n,int target){
        if(n>target){
            return ;
        }
        System.out.println(n);
        printNumber(n+1,target);
    }
    public static void main(String[] args) {
        printNumber(1,10);
    }
}