import java.util.Scanner;
public class TwoDarray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows and columns");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        int arr [] [] = new int[n][m];
        System.out.println("enter the elemenets");
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                sum += arr[i][j];
            }

             
        }
        System.out.println("the sum of all the elements of the array is :" +sum);
    }
    
}
