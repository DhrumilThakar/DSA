public class factorial {
    public static int fact(int n){
        int result=1;
        System.out.print(n+"! = ");
        for(int i=n;i>=1;i--){
            System.out.print(i);
            result *=i;
            if(i!=1){
                System.out.print("*");
            }
        }
        System.out.println("="+result);
        return result;
    }
    public static void main(String[] args) {
        int n = 5; // Example input
        System.out.println("Factorial of " + n + " is: " + fact(n));
    }
}
