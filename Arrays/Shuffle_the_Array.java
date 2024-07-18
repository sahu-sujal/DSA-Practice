package Arrays;

import java.util.Arrays;

public class Shuffle_the_Array {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,
                      4,3,2,1};
        System.out.println(Arrays.toString(shuffle(nums, 4)));
        System.out.println(Arrays.toString(efficientsolution(nums, 4)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int shuff[] = new int[nums.length];
        int Y[] = new int[n];
        int temp = 0;
        int temp2 = 0;
        for (int i = n; i < nums.length; i++) {
                Y[temp] = nums[i];
                temp++;
        }
        temp = 0;
        for (int i = 0; i < shuff.length; i++) {
            if (i%2==0) {
                shuff[i] = nums[temp2];
                temp2++;
            }else{
                shuff[i] = Y[temp];
                temp++;
            }
        }
       
        return shuff;
    }

    static int[] efficientsolution(int[] nums, int n){
        int shuff[] = new int[nums.length];
        
        int i = 0;
        int j = n;
        int k = 0;
        while (k < nums.length) {
            shuff[k++] = nums[i++];
            shuff[k++] = nums[j++];
        }
       
        return shuff;
    }
}