package Functions;

import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.println("The Maximum is : " + max(a, b, c));
        System.out.println("The Minimum is : " + min(a, b, c));
    }

    static int max(int a, int b, int c){
        if(a > b){
            if (a > c) {
                return a;
            }
        }
        if(b > c){
                return b;
        }else{
            return c;
        }
    }

    static int min(int a, int b, int c){
        if(a < b){
            if (a < c) {
                return a;
            }
        }
        if(b < c){
                return b;
        }else{
            return c;
        }
    }
}