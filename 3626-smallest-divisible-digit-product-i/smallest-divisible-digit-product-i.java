
import java.util.*;
class Solution {
    public int smallestNumber(int n, int t) {
        
        while(true){
            if(pro(n) % t == 0) return n;

            n++;
        }


    }

    public static int pro(int n){
        int prod = 1;

        while(n > 0){
            prod *= (n%10);
            n = n/10;
        }
        return prod;
    }
}