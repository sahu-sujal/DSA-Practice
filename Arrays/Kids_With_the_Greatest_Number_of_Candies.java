package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies {
    public static void main(String[] args) {
        int candies[] = {2,3,5,1,3};
        System.out.println(kidsWithCandies(candies, 3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<Boolean>();
        int max = 0;
        for (int i : candies) {
            if(max < i){
                max = i;
            }
        }
        for (int i : candies) {
            int temp = i + extraCandies;
            if(temp >= max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}
