package BASIC_JAVA_PROBLEM;
import java.util.Scanner;

public class currency_conversion {
    public static void main(String[] args) {
        System.out.println("Enter Rupees");
        Scanner sc = new Scanner(System.in);
        int inr = sc.nextInt();

        float USD = (float)(inr * 0.012);
        System.out.println(inr + " INR is equal to " + USD + " USD");
    }
}
