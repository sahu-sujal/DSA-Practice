package Arrays;

public class Find_the_Highest_Altitude {
    public static int largestAltitude(int[] gain) {
        int higest = 0;
        int temp =0;
            for (int i = 0; i < gain.length; i++) {
                temp += gain[i];
                if(higest < temp){
                    higest = temp;
                }
            }
        return higest;
    }

    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
}
