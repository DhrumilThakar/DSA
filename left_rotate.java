// Given an integer array nums, rotate the array to the left by one.

public class left_rotate {

    public static void rotate_brute(int arr[]) { // Time Complexity = O(n) and Space complexity = O(n)
        int n = arr.length;

        int[] temp = new int[n];

        for (int i = 1; i < n; i++) {
            temp[i - 1] = arr[i];
        }
        temp[n - 1] = arr[0];

        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }

    public static void rotate_optimal(int arr[]) { // Time Complexity = O(n) and Space Complexity = O(1)

        int temp = arr[0];
        int n = arr.length;
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        rotate_brute(arr);
        rotate_optimal(arr);
    }
}
