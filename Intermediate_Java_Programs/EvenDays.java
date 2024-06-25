package Intermediate_Java_Programs;

public class EvenDays {
    
        public static void main(String[] args) {
            int daysInAugust = 31; // August has 31 days
            int evenDaysCount = 0;
    
            // Loop through all the days in August
            for (int day = 1; day <= daysInAugust; day++) {
                if (day % 2 == 0) {
                    evenDaysCount++;
                }
            }
    
            // Print the number of even days in August
            System.out.println("John can go out on " + evenDaysCount + " days in August.");
        }
    
    
}
