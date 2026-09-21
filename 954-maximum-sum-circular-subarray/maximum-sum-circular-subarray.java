class Solution {

    public int xyz(int[] nums){

        int min = Integer.MAX_VALUE;
        int n = nums.length;

        int sum = 0;
        for(int i  = 0; i<n; i++){

            sum += nums[i];

            min = Math.min(min, sum);
            if(sum > 0) sum = 0;



        }

        return min;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int Totalsum = 0;

        int sum = 0;

        int max = Integer.MIN_VALUE;
        
        for(int  i = 0; i<n; i++){
            

            Totalsum += nums[i % n];

            sum += nums[i];

            max = Math.max(sum, max);

            if(sum < 0) sum = 0;

            
            
        }

        int min = xyz(nums);

        if(max < 0) return max;


        return Math.max(Totalsum - min, max);
    }
}