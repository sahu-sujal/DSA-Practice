
package Arrays;

public class Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};

        int sum = 0;
        int temp = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            if (i == temp) {
                sum = sum + matrix[i][i];
            } else {
                sum += matrix[i][i];
                sum += matrix[i][temp]; 
            }
            temp--;
        } 

        System.out.println(sum);
    }
}

