package math.problems;
import java.util.Arrays;
public class FindMissingNumber {

    public static int missingNumber(int array[]) {
        boolean[] numbers = new boolean[array.length + 2];
        for (int i = 0; i < array.length; i++) {
            numbers[array[i]] = true;
        }
        //return missing number
        for (int i = 1; i < numbers.length; i++) {
            if (!numbers[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int[] array = {10, 2, 9, 4, 5, 3, 1, 8, 6};
        System.out.println(missingNumber(array));
    }
}