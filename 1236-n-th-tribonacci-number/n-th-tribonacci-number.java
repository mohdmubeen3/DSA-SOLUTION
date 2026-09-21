import java.util.Arrays;
class Solution {

    public int xyz(int n, int [] memo){
        if(n==0) return 0;
        if(n==1) return 1;
        if(n== 2) return 1;

        if(memo[n] != -1) return memo[n];

        return memo[n] = xyz(n-1, memo) + xyz(n-2, memo) + xyz(n-3, memo);
    }
    public int tribonacci(int n) {

        int [] memo = new int[n+1];
        Arrays.fill(memo, -1);

        return xyz(n, memo);

        
    }
}