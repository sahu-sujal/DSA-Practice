package Arrays;

import java.util.Arrays;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i = 0; i < nums.length;i++){
            int count = 0;
            int j = 0; 
            while(j < nums.length){
                if(nums[i] > nums[j]){
                    count++;
                }
                j++;
            }
           arr[i] = count;
        }

        return arr;
    }

    public static void main(String[] args) {
        int nums[] = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    
}