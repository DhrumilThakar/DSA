/*Given an integer array nums sorted in non-decreasing order, remove all duplicates in-place so that each unique element appears only once. */

public class remove_duplicated {

    public static int remove_optimal(int arr[]) { // Time Complexity = O(n) and Space Complexity = O(1)

        if (arr.length == 0) {
            return 0;
        }
        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 3, 3, 5 };
        int k = remove_optimal(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}