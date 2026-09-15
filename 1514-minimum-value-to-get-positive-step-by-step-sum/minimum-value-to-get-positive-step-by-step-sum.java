class Solution {
    public int minStartValue(int[] nums) {
        int minPreSum = Integer.MAX_VALUE;
        int sum = 0;
        for(int num : nums){
            sum += num;
            minPreSum = Math.min(sum, minPreSum);
        }
        if(minPreSum <= 0){
            int startVal = Math.abs(minPreSum) + 1;
            return startVal;

        } else {
            return 1;
        }
        

        
    }
}