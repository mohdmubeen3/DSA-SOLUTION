class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum1  = 0;

        int n = weights.length;

        int ans = 0;

        for(int weight : weights){
            if(max < weight){
                max = weight;
            }
            sum1 += weight;
        }

        int left = max;
        int right = sum1;

        while(left <= right){
            int capacity = left + (right - left)/2;

            int cnt = 1;

            int l = 0;
            int r = 0;
            int sum = 0;
            while(r < n){

                

                if(sum + weights[r]> capacity){
                    
                    cnt++;
                    sum = 0;
                    
                }
                sum += weights[r];
                
                r++;

                



            }

            if(cnt <= days){
                ans = capacity;
                right= capacity - 1;
            } else {
                left = capacity + 1;
            }
        }

        return ans;
    }
}