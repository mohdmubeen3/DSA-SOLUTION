import java.util.*;
class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;

        for(int num : nums){
            total += num;
        }

        int ans = -1;

        int sum = 0;

        for(int i = 0; i<nums.length; i++){



            int right = total - sum - nums[i];

            if(sum == right){
                ans = i;

                return ans;
            }

            sum += nums[i];


        }

        return ans;
        
    }
}