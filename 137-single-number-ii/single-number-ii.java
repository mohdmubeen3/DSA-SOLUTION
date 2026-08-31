import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i = 0; i<32; i++){
            int c = 0;
            for(int num : nums){
                if((num & (1 << i)) != 0) c ++;
            }

            if(c % 3 != 0){
                res = res | (1 << i);
            }
        }


        return res;

        
    }
}