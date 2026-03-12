public class OddOccurrencesFinder {
    public static void findTwoOddNumbers(int[] nums) {
        int xorAll = 0;

        // Step 1: XOR all elements
        for (int num : nums) {
            xorAll ^= num;
        }

        // Step 2: Find rightmost set bit in xorAll
        int rightmostSetBit = xorAll & -xorAll;

        // Step 3: Divide elements into two groups and XOR separately
        int num1 = 0, num2 = 0;
        for (int num : nums) {
            if ((num & rightmostSetBit) != 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }

        // Output the result
        System.out.println(num1 + " " + num2);
    }

    public static void main(String[] args) {
        int[] nums = {8, 8, 15, 3, 3, 7, 3, 5};
        findTwoOddNumbers(nums); // Output: 9 5
    }
}
