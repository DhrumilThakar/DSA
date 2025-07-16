public class power_of_number {
    public static int power(int base,int exponent){
        if(exponent == 0){
            return 1;
        }
        return base * power(base,exponent-1);
    }
    public static void main(String[] args) {
        int base = 2; // Example base
        int exponent = 3; // Example exponent
        System.out.println(base + " raised to the power of " + exponent + " is: " + power(base, exponent));
    }
}
