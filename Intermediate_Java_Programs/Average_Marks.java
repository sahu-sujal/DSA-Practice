package Intermediate_Java_Programs;

import java.util.Scanner;

public class Average_Marks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        double[] marks = new double[numberOfSubjects];

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }

        double sum = 0.0;

        for (double mark : marks) {
            sum += mark;
        }

        System.out.print("The average marks are : "+ sum / marks.length);
    }
}