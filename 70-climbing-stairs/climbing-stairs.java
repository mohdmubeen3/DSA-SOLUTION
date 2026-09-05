class Solution {

    public int xyz(int n, int [] dp ){

        if(n == 1) return 1;
        if(n == 2) return 2;

        if(dp[n] != -1) return dp[n];

        dp[n] = xyz(n-1, dp) + xyz(n-2, dp);

        return dp[n];

    }
    public int climbStairs(int n) {

        int dp[] = new int[n+1];

        for(int i = 0; i<n+1; i++){
            dp[i] = -1;
        }

        return xyz(n, dp);
        
    }
}