package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Plus_One {

    public static void main(String[] args) {
        int[] digits = {9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
        
    }
    public static int[] plusOne(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>();
        int k = 1;
        int i = digits.length - 1;
        while (k != 0 || i >= 0) {
            if (i >= 0) {
                k = k + digits[i];
            }
            list.add(0,k%10);
            k = k/10;
            i--;
        }
        int ans[] = new int[list.size()];
        for (int j = 0; j < ans.length; j++) {
            ans[j] = list.get(j);
        }
        return ans;
    }
    
}