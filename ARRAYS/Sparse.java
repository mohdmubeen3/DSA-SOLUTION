import java.util.Scanner;
public class Sparse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of the rows:");
        int n = sc.nextInt();
        System.out.println("enter the number of columns:");
        int m = sc.nextInt();
        System.out.println("enter the wewlement of the matrix:");
            int arr[][] = new int[n][m];
            for(int i = 0; i<n; i ++) {
                for(int j = 0; j <m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("the matrix is :");
            for(int i = 0; i<n; i ++) {
                for(int j = 0; j <m; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            //for sparse matrix
            int zero = 0;
            int nz = 0;
            for(int i =0; i<n; i++) {
                for(int j = 0; j<m; j++) {
                    if(arr[i][j] == 0) {
                        zero++;
                    } else {
                        nz++;
                    }
                }
            }
            int[][] sparse = null;
            if(zero < nz) {
                System.out.println("The matrix is not sparse");
            } else {
                 sparse = new int[nz][3];
                 int k = 0;
                 for(int i = 0; i<n; i++) {
                    for(int j = 0; j<m; j++) {
                        if(arr[i][j] != 0) {
                            sparse[k][0] = i;
                            sparse[k][1] = j;
                            sparse[k][2] = arr[i][j];
                            k++;
                        }
                    }
                 }
                 // Print the sparse matrix
                 System.out.println("Sparse matrix representation (row, column, value):");
                 for(int i = 0; i < nz; i++) {
                     System.out.println(sparse[i][0] + " " + sparse[i][1] + " " + sparse[i][2]);
                 }
            }
        }

    }
