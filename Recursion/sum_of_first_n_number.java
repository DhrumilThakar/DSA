public class sum_of_first_n_number {
    public static int sum(int n){
        if(n<=0){
            return 0;
        }
        return n +sum(n-1);
    }
    public static void main(String[] args) {
        int n = 5; // Example input
        System.out.println("Sum of first " + n + " natural numbers is: " + sum(n));
    }
}
