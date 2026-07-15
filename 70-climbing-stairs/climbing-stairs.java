class Solution {
    static int dp[];
    public int climbStairs(int n) {
        dp = new int[n+1];
        for(int i = 0; i<n+1; i++){
            dp[i] = -1;
        }
        return solve(n, dp);
    }

    static int solve(int n, int[] dp ){
        if(n == 0 || n==1) return 1;

        if(dp[n] != -1) return dp[n];

        dp[n] = solve(n-1, dp) + solve(n-2, dp);

        return dp[n];
    }
}