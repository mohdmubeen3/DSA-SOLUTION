class Solution {

    public int xyz(int n , int[] dp){
        if(n  <= 1) return 1;

        if(dp[n] != -1) return dp[n];

        return dp[n] = xyz(n-1, dp) + xyz(n-2, dp);
    }
    public int climbStairs(int n) {
        int dp[] = new int[n+1];

        Arrays.fill(dp, -1);

        return xyz(n, dp);
    }
}