public class sum_of_digit {
    public static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10 +sumOfDigits(n/10);
    }
    public static void main(String[] args) {
        int n = 12345; // Example input
        System.out.println("Sum of digits of " + n + " is: " + sumOfDigits(n));
    }
}
