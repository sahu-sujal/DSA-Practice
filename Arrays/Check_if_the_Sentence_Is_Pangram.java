package Arrays;

public class Check_if_the_Sentence_Is_Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
        
    }

    public static boolean checkIfPangram(String sentence) {

        if (sentence.length() >= 26) {
            int count = 0;
            char i = 'a';
            while(i <= 'z'){
                String temp = "" + i;
                if (sentence.indexOf(temp) > -1) {
                    count++;
                }
                i++;
            }
            if(count == 26){
                return true;
            }
        }

        return false;
    }
}