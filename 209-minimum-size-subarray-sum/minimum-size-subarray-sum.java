class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;

        int l  = 0;
        int n = nums.length;

        int r =  0;

        int sum = 0;

        while(r < n){
            sum += nums[r];

            while(sum >= target){

                ans = Math.min(ans, r-l+1);
                sum -= nums[l];
                l++;
                
            }
            r++;

        }

        if(ans != Integer.MAX_VALUE) return ans;
        else return 0;
    }
}