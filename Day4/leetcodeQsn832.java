package Day4;

// https://leetcode.com/problems/flipping-an-image/

public class leetcodeQsn832 {
    void reverse(int[][] arr){
        for(int i=0; i<arr.length; i++){
            int start = 0;
            int end = arr[i].length-1;
            
            while (end > start) {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;

                start++;
                end--;
            }
        }
    }
    public int[][] flipAndInvertImage(int[][] image) {
        reverse(image);

        for(int i=0; i<image.length; i++){
            for(int j=0; j<image[i].length; j++){
                if(image[i][j] == 0){
                    image[i][j] = 1;
                } else{
                    image[i][j] = 0;
                }
            }
        }

        return image;
    }
}
