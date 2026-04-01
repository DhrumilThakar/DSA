// Given a number ‘N’, find out the sum of the first N natural numbers .

public class sumofNnumber {

    public static int sum(int n){
        if(n<0){
            return 0;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        System.out.print(sum(5));
    }
}
