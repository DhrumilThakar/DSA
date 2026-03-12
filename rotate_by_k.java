//Given an array of integers, rotating array of elements by k elements either left or right.

import java.sql.Time;
import java.util.*;

public class rotate_by_k {

    public static void rotate_brute_left(int[] arr, int k) { // Time Complexity = O(n) & Space Complexity = O(k)

        if (arr.length == 0) {
            return;
        }
        int n = arr.length;

        k = k % n;
        int[] temp = Arrays.copyOfRange(arr, n - k, n);

        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        for (int i = n - k; i < n; i++) {
            arr[i] = arr[i - (n - k)];
        }
    }

    public static void rotate_brute_right(int[] arr, int k) {// Time Complexity = O(n) & Space Complexity = O(k)
        if (arr.length == 0) {
            return;
        }
        int n = arr.length;
        k = k % n;

        int temp[] = Arrays.copyOfRange(arr, n - k, n);

        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }

    public static int[] rotate_optimal(int[] arr, int k, String Direction) { // Time Complexity = O(N) and Space
                                                                             // complexity = O(1)

        if (arr.length == 0 || k == 0) {
            return arr;
        }
        k = k % arr.length;

        if (Direction.equals("right")) {
            reverse(arr, 0, arr.length - 1);
            reverse(arr, 0, k - 1);
            reverse(arr, k, arr.length - 1);
        } else {
            reverse(arr, 0, k - 1);
            reverse(arr, k, arr.length - 1);
            reverse(arr, 0, arr.length - 1);
        }

        return arr;

    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 2;
        String s = "right";
        System.out.println("Left");
        rotate_brute_left(arr, k);
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
        rotate_brute_right(arr, k);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Optimal");
        System.out.println(Arrays.toString(rotate_optimal(arr, k, s)));

    }
}