class Solution {
    public int xyz(int[] cost, int n, int[] dp){
        if(n == 1 || n == 0) return cost[n];
        if(dp[n] != -1) return dp[n];

        dp[n] = cost[n] + Math.min(xyz(cost, n-1, dp), xyz(cost, n-2, dp));

        return dp[n];

        
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp [] = new int[n+1];
        for(int i = 0; i<n+1; i++){
            dp[i] = -1;
        }

        return Math.min(xyz(cost, n-1, dp), xyz(cost, n-2, dp));


    }
}