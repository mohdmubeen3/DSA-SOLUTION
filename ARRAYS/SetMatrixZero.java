import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;

public class SetMatrixZero {
    public static void main(String args[]) {

         int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        int n = matrix.length;
         int m = matrix[0].length;
      //   for(int i = 0; i<n; i++) {
      //    for(int j = 0; j<m; j++) {
      //       if(matrix[i][j] == 0){
      //          for(int k = 0; k<m; k++) {
      //             if(matrix[i][k] != 0){
      //                 matrix[i][k] = -1;

      //             }
                 
      //          }

      //          for(int k = 0; k<n;  k++) {
      //             if(matrix[k][j] != 0){
      //                 matrix[k][j] = -1;

      //             }
                 
      //          }
      //       }
      //    }
      //   }

      //   for(int i = 0; i<n; i++) {
      //    for(int j = 0;  j<m; j ++) {
      //       if(matrix[i][j] == -1){
      //          matrix[i][j] = 0;

      //       }
      //    }
      //   }

      //Better Approach

      // boolean row[] = new boolean[n];
      // boolean cols[] = new boolean[m];
      // for(int i = 0; i<n ; i++)  {
      //    for(int j = 0; j<m; j ++) {
      //       if(matrix[i][j] == 0){
      //          row[i] = true;
      //          cols[j] = true;

      //       }
      //    }

        
      // }

      // for(int  i = 0; i<n; i++) {
      //    for(int j = 0; j<m; j++) {
      //       if(row[i] || cols[j]) {
      //          matrix[i][j] = 0;
      //       }
      //    }
      // }

      // optimal

      boolean firstRowZero = false;
      boolean firstColZero = false;

       for(int j = 0;  j<m; j++) {
         if(matrix[0][j] == 0) {
            firstRowZero = true;
            break;
         }
       } 
       for(int i = 0; i<n; i++) {
         if(matrix[i][0] == 0) {
            firstColZero = true;
            break;
         }
       }

       for(int i = 1; i<n; i++) {
         for(int j = 1; j <m; j++) {
            if(matrix[i][j] == 0) {
               matrix[i][0] = 0;
               matrix[0][j] = 0;
            }
         }
       }
       for(int i = 1; i<n; i++) {
         for(int j = 1; j <m; j++) {
            if(matrix[i][0] == 0 || matrix[0][j] == 0) {
               matrix[i][j] = 0;
            }
         }
       }

       if (firstRowZero) {
            for (int j = 0; j < m; j++) matrix[0][j] = 0;
        }

        // Zero first column if needed
        if (firstColZero) {
            for (int i = 0; i < n; i++) matrix[i][0] = 0;
        }






        for(int i = 0; i<n; i++) {
         for(int j = 0; j<m; j++) {
            System.out.print(matrix[i][j]);
         }
         System.out.println();
        }

        


 
}
}

