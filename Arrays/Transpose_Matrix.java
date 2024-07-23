package Arrays;

import java.util.Arrays;

public class Transpose_Matrix {
    public static void main(String[] args) {

        int matrix[][] ={{1,2,3},
                         {4,5,6},
                         {7,8,9}};

        int[][] transpose = transpose(matrix);

        for (int[] is : transpose) {
            for (int is2 : is) {
                System.out.print(is2);
            }
            System.out.println();
        }
        
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }


        return transpose;
    }
}
