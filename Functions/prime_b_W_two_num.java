package Functions;

import java.util.Scanner;

public class prime_b_W_two_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();

        prime(min, max);
    }

    static void prime(int min, int max){
        for (int i = min; i <= max; i++) {
            int count = 0 ;
            for (int j = 2; j*j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    System.out.println(i + " : Not Prime");
                }
               
            }
            if (count == 0) {
                System.out.println(i + " : Prime");
            }
            
        }
    }
}
