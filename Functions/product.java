package Functions;

import java.util.Scanner;

public class product {
    static void prod(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("the Product is :"+a * b);
    }
    public static void main(String[] args) {
        prod();
    }
}
