import java.util.*;
class Solution {
    public static int nextDigit(int n){
         int new_num = 0;

        while(n > 0){
            int digit = n % 10;

            new_num += digit * digit;

            n = n/10;

        }

        return new_num;

       
    }
    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();
        while(n != 1){
            if(set.contains(n)) return false;

            set.add(n);

            n = nextDigit(n);

           


        }


        return n==1;
       

        
        

       
    }

    
}