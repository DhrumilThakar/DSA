/*Given an integer n, write a function to print all numbers from 1 to n (inclusive) using recursion.
->You must not use any loops such as for, while, or do-while.
->The function should print each number on a separate line, in increasing order from 1 to n. */

public class recursion{
    public static void printNumbersDecreasing(int n,int curr) {
        if(curr>n){
            return;
        }
        printNumbersDecreasing(n,curr+1);
        System.out.println(curr);

    }

    public static void printNumbersIncreasing(int curr,int n){

        if(curr<1){
            return;
        }
        printNumbersIncreasing(curr-1, n);
        System.out.println(curr);
    }
    public static void main(String[] args) {
        printNumbersDecreasing(5,1);
        printNumbersIncreasing(5,5);
    }
}
