package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Create_Target_Array_in_the_Given_Order {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 0 };
        int index[] = { 0, 1, 2, 3, 0 };
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int target_array[] = new int[nums.length];
        for (int i = 0; i < index.length; i++) {
                   
                        for (int j = target_array.length - 1; j > index[i]; j--) {
                            target_array[j] = target_array[j-1];                    
                        }
                    
            target_array[index[i]] = nums[i];
            
        }
        return target_array;
    }

    public static int[] efficien(int[] nums, int[] index){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] target = new int[index.length];

        for (int i = 0; i < target.length; i++) {
            target[i] = list.get(i);
        }
        return target;
    }
}
