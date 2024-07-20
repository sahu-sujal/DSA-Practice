package Arrays;

public class Cells_with_Odd_Values_in_a_Matrix {
    public static int oddCells(int m, int n, int[][] indices) {
        int matrix[][] = new int[m][n];
        int odds = 0;

        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];

            //incrementing row
            for (int j = 0; j < matrix[row].length; j++) {
                matrix[row][j] += 1;
            }

            for (int j = 0; j < matrix.length; j++) {
                matrix[j][col] +=1;
            }
        }

       for (int[] row : matrix) {
        for (int ele : row) {
            if (ele %2 == 1) {
                odds++;
            }
        }
       }

        return odds;
    }

    public static void main(String[] args) {
        int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(2, 3, indices));
    }

}