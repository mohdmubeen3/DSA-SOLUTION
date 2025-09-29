import java.util.Scanner;
public class Insertion {
    public static void main(String[] args) {
       //insertion at beginning
       int[] arr = {12,13,14,16,0};
       int n = 4;
       int element = 34;
        for(int i =n-1; i>=0; i--){
         arr[i + 1] = arr[i];
        }
       arr[0] = element;
       for(int i =0; i<=n; i++){
           System.out.print(arr[i]+" ");
       }

    }



     
    

}
