package Functions;

public class PythagoreanTripletChecker {

    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int sumOfSquares = a * a + b * b + c * c;

        return 2 * max * max == sumOfSquares;
    }
    public static void main(String[] args) {
        int a1 = 3, b1 = 4, c1 = 5;
        int a2 = 5, b2 = 12, c2 = 13; 
        int a3 = 1, b3 = 2, c3 = 3; 

        System.out.println("(" + a1 + ", " + b1 + ", " + c1 + ") is a Pythagorean triplet? " + isPythagoreanTriplet(a1, b1, c1));
        System.out.println("(" + a2 + ", " + b2 + ", " + c2 + ") is a Pythagorean triplet? " + isPythagoreanTriplet(a2, b2, c2));
        System.out.println("(" + a3 + ", " + b3 + ", " + c3 + ") is a Pythagorean triplet? " + isPythagoreanTriplet(a3, b3, c3));
    }
}
