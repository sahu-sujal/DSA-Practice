package Arrays;

import java.util.Arrays;

public class Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        int[] Runningsum = new int[nums.length];
        Runningsum[0] = nums[0];
        int temp = nums[0];
        for (int i = 1; i < Runningsum.length; i++) {
            Runningsum[i] = temp + nums[i];
            temp = Runningsum[i];
        }
        
        return Runningsum;
    }


}
