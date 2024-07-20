package Arrays;
import java.util.ArrayList;
import java.util.List;

public class Count_Items_Matching_a_Rule {

    public static void main(String[] args) {
        ArrayList<List<String>> arrayList = new ArrayList<>();

        // Create individual ArrayLists with the required values
        List<String> phoneBluePixel = new ArrayList<>();
        phoneBluePixel.add("phone");
        phoneBluePixel.add("blue");
        phoneBluePixel.add("pixel");
        
        List<String> computerSilverLenovo = new ArrayList<>();
        computerSilverLenovo.add("computer");
        computerSilverLenovo.add("silver");
        computerSilverLenovo.add("lenovo");
        
        List<String> phoneGoldIphone = new ArrayList<>();
        phoneGoldIphone.add("phone");
        phoneGoldIphone.add("gold");
        phoneGoldIphone.add("iphone");
        
        // Add the individual ArrayLists to the main ArrayList
        arrayList.add(phoneBluePixel);
        arrayList.add(computerSilverLenovo);
        arrayList.add(phoneGoldIphone);

        System.out.println(countMatches(arrayList, "color", "silver"));
        
    }


    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int match = 0;
        for(int i = 0; i < items.size(); i++){
           if(ruleKey .equals("type")){
            if (items.get(i).get(0).equals(ruleValue)) {
                match++;
            }
           }else 
           if(ruleKey.equals("color")){
            if (items.get(i).get(1).equals(ruleValue)) {
                match++;
            }
           }else
           if(ruleKey.equals("name")){
            if (items.get(i).get(2).equals(ruleValue)) {
                match++;
            }
           }
        }
        return match;
    }
}
