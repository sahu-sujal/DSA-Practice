package Arrays;

public class Reshape_the_Matrix {
    public static void main(String[] args) {
        
    }
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;

        if (row*col == r*c) {
            int ans[][] = new int[r][c];
            int x = 0,y = 0;

           for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans.length; j++) {
                    if (y == c) {
                        x++;
                        y = 0;
                    }
                    ans[x][y] = mat[i][j];
                    y++;
                }
           }

            return ans;
        }else{
            return mat;
        }
        
    }
}
