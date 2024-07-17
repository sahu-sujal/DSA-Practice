package Arrays;

import java.util.Arrays;

public class Concatenation_of_Array {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] Concatenation = new int[2 * nums.length];
        int count = 0;
        int j = 0;
        while (j != 2) {
            for (int i : nums) {
                Concatenation[count] = i;
                count++;
            }
            j++;
        }
        return Concatenation;
    }
}
