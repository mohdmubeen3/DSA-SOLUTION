class Solution {

    public int xyz(int [] nums, int i, int n , int[] dp){
        if(i > n ) return 0;

        if(dp[i] != -1) return dp[i];

        return dp[i] = Math.max((nums[i] + xyz(nums, i + 2, n, dp)), xyz(nums, i + 1, n, dp));
    }
    public int rob(int[] nums) {
        int n = nums.length;

        if(n==1) return nums[0];

        int dp[] = new int[n + 1];
        int dp1[] = new int[n+1];

        Arrays.fill(dp, - 1);
        Arrays.fill(dp1, - 1);

        return Math.max(xyz(nums, 0, n-2, dp), xyz(nums, 1, n-1, dp1));
        
    }
}