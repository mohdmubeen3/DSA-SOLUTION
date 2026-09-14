class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;

        int total = 0;

        int res[] = new int[n];

        for(int num:nums){
            total += num;
        }

        int r = 0;
        int l = 0;

        for(int i = 0; i<n; i++){

            r = total - l - nums[i];
            res[i] = Math.abs(r - l);
            l = l + nums[i];

        }

        return res;
    }
}