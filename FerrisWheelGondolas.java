import java.util.Arrays;

public class FerrisWheelGondolas {
    public static int minGondolas(int[] arr, int X) {
        Arrays.sort(arr); // Sort weights
        int i = 0, j = arr.length - 1;
        int gondolas = 0;

        while (i <= j) {
            if (arr[i] + arr[j] <= X) {
                // Pair i and j
                i++;
                j--;
            } else {
                // j goes alone
                j--;
            }
            gondolas++;
        }

        return gondolas;
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 2, 3, 9};
        int X1 = 10;
        System.out.println(minGondolas(arr1, X1)); // Output: 3

        int[] arr2 = {2, 3, 3, 4};
        int X2 = 6;
        System.out.println(minGondolas(arr2, X2)); // Output: 2

        int[] arr3 = {5, 3, 4, 4, 2};
        int X3 = 8;
        System.out.println(minGondolas(arr3, X3)); // Output: 3
    }
}
