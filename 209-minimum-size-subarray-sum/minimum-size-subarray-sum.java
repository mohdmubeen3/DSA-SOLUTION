import java.util.*;
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int l = 0;
        int r = 0;
        int sum = 0;
        while(r < n){

            sum += nums[r];

           
                
            

            while(sum >= target){
                min = Math.min(min, r - l + 1);
                sum -= nums[l];
                l++;

            }

            r++;

        }
        if(min != Integer.MAX_VALUE){
            return min;
        } else {
            return 0;
        }
    }
}