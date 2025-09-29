import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;

public class RotateMatrixBy90 {
    public static void main(String args[]) {

         int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

          int m = matrix.length;
          int n = matrix[0].length;
          int ans [][] = new int[m][n];

      //     for(int i = 0; i<m; i++) {
      //       for(int j = 0; j<n; j++) {
      //          ans[j][(n-1) - i] = matrix[i][j];
      //       }
      //     }



      //   for(int i = 0; i<n; i++) {
      //    for(int j = 0; j<m; j++) {
      //       System.out.print(ans[i][j]);
      //    }
      //    System.out.println();
      //   }

       for(int i =0; i<m; i++) {
         for(int j = i; j<n; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
         }
       }

       //reversing each row

       for (int i = 0; i < m; i++) {
    int low = 0, high = n - 1;
    while (low < high) {
        int temp = matrix[i][low];
        matrix[i][low] = matrix[i][high];
        matrix[i][high] = temp;
        low++;
        high--;
    }
}


      for(int i = 0; i<m; i++) {
         for(int j = 0;  j<n; j++) {
            System.out.print(matrix[i][j]);
         }
         System.out.println();
      }

        


 
}
}

