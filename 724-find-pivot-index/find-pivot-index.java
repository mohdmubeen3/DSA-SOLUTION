class Solution {
    public int pivotIndex(int[] nums) {
       int temp [] = new int[nums.length];
       temp[0] = nums[0];

       for(int i = 1; i<nums.length; i++){
         temp[i] = temp[i-1] + nums[i];
       }

       int n = nums.length;

       

       for(int i = 0; i<nums.length; i++){

        int ls = (i == 0) ? 0 : temp[i - 1];
        int rs = temp[n-1] - temp[i];

        if(ls == rs) return i;
        
       }

        return -1;
    }
}