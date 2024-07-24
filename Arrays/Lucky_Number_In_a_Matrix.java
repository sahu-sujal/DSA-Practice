package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Lucky_Number_In_a_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},
                          {9,11,13},
                          {15,16,17}};

       System.out.println( luckyNumbers(matrix));
    }

    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                int count = 0;
                for (int k = 0; k < matrix[i].length; k++) {
                    if(temp < matrix[i][k]){
                        count++;
                    }
                }
                if (count == matrix[i].length - 1) {
                    count = 0;
                    for (int k = 0; k < matrix.length; k++) {
                        if (temp > matrix[k][j]) {
                            count++;
                        }
                    }
                    if (count == matrix.length-1) {
                        list.add(temp);
                    }
                }
            }
        }

        return list;
    }
}
