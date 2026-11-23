class Solution {

    public int xyz(int[] cost, int n, int [] dp ){

        if(n == 0 || n == 1) return cost[n];

        if(dp[n] != -1) return dp[n];

        dp[n] =cost[n] + Math.min(xyz(cost, n-1, dp), xyz(cost, n-2, dp));

        return dp[n];
    }
    
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n+1];

      Arrays.fill(dp, -1);

        return Math.min(xyz(cost, n-1, dp), xyz(cost, n - 2, dp));
    }
}