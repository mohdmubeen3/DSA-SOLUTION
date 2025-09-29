import javax.sound.sampled.SourceDataLine;

public class SpiralMatrix {
    public static void main(String args[]) {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int m = arr.length;
        int n = arr[0].length;
        int top = 0;      // first row
        int bottom = m-1; // last row
        int left = 0;     // first col
        int right = n-1;  // last col

        while (left <= right && top <= bottom) {
             
             for(int i = left; i<= right; i++) {
                System.out.print(arr[top][i]);
             }
             top++;

             for(int i= top; i<= bottom; i++) {
                System.out.print(arr[i][right]);
             }
             right--;

             if(top <= bottom){
                for(int i = right; i>= left; i--) {
                System.out.print(arr[bottom][i]);
             }
             bottom--;
             }

             if(left <= right) {
                for(int i = bottom; i>= top; i--) {
                    System.out.print(arr[i][left]);
                }
                left++;

             }

             
        }
    }
}
