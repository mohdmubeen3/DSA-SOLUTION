class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;

        int max = 0;
        int n = piles.length;
        for(int i = 0; i<n; i++) {
            if(max < piles[i]){
                max = piles[i];
            }
        }

        int r = max;

        int ans = 0;
        while(l <= r){
            int k = l + (r - l) / 2;

            long  hours = 0;

            for(int i = 0; i<n; i++) {
                int pile = piles[i];
                hours += (pile + (long) k - 1) / k;
            }

            if(hours <= h){
                ans = k;
                r = k - 1;
            } else if(hours > h){
                l = k + 1;
            }
        }

        return ans;
    }
}