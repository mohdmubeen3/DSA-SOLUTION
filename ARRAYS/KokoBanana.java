import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;

public class KokoBanana {
    public static void main(String args[]) {

         int arr[]  = {7,15,6,3};
         int h = 8;
         int max = Integer.MIN_VALUE;
         int n  = arr.length;
         for(int i = 0; i<n; i++) {
            if(arr[i] > max){
                max = arr[i];

            }
         }

         int low = 1;
         int high = max;
         while(low <= high) {
            int mid = (low + high) / 2;
            int totalHours = 0;
            for(int i = 0; i<n; i++){
                totalHours += Math.ceil((double)arr[i]/mid);

               
            }
             if(totalHours <= h){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            
         }
         System.out.println(low);
        
        
 
}
}

