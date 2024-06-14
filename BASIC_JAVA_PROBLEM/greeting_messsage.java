package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

public class greeting_messsage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Hello" + name);
    }
}
