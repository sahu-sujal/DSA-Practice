package Arrays;

public class Flipping_an_Image {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] flippedImage = flipAndInvertImage(image);

        for (int i = 0; i < flippedImage.length; i++) {
            for (int j = 0; j < flippedImage[i].length; j++) {
                System.out.print(flippedImage[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] flip = new int[image.length][image.length];

        for (int i = 0; i < image.length; i++) {
            int k = image[i].length - 1;
            for (int j = 0; j < image[i].length; j++) {
                if(image[i][k] == 0){
                    flip[i][j] = 1;
                }else{
                    flip[i][j] = 0;
                }
                k--;
            }
        }
        return flip;
    }
    
}
