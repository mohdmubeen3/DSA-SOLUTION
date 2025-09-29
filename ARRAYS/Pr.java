import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;

public class Pr {
    public static void main(String args[]) {

         int [] arr = {1,1,1};
         int x= 2;
         int n = arr.length;
         int count = 0;
        for(int i= 0; i<n; i++) {
         int sum = 0;
         for(int j = i; j<n; j++) {
            sum = sum + arr[i];
            
            
            if(sum ==x) {
               count++;
            }
         }
        }
        System.out.println(count);
 
}
}

