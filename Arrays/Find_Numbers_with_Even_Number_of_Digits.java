package Arrays;

public class Find_Numbers_with_Even_Number_of_Digits {

    public static int findNumbers(int[] nums) {
        int even = 0;
        for(int i = 0; i<nums.length; i++){
            int value = nums[i];
            int digit = 0;
            
            while (value != 0){
                value /= 10;
                digit++;
            }

            if (digit % 2 == 0) {
                even++;
            }
        
    }
        return even;
    }

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};

        System.out.println(findNumbers(nums));
    }
}