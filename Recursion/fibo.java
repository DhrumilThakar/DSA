public class fibo {
    public static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int n = 5; // Example input
        System.out.print("Fibonacci series up to " + n + " is: ");
        for (int i = 0; i <=n; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();
    }
}