import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int ans = nums[0] + nums[1] + nums[2];
        for(int i = 0; i<nums.length; i++){
           

            int l = i + 1;
            int r = nums.length - 1;

            while(l < r){
                
                int sum = nums[l] + nums[r] + nums[i];
               if (Math.abs(target - sum) < Math.abs(target - ans)) {
                     ans = sum;
                }

                if(sum > target){
                    r--;
                } else {
                    l++;
                }


            }
        }

        return ans;
        
    }
}