class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f = -1;
        int last = -1;
        int l = 0;
        int r = nums.length - 1;

        while(l <= r) {
            int mid = l + (r - l)/2;

            if(nums[mid] == target) {
                f = mid;
                r = mid -1;
            } else if(nums[mid] > target) {
                r = mid -1;
            } else {
                l  = mid + 1;
            }
        }
        l = 0;
        r = nums.length - 1;
        while(l <= r) {
            int mid = l + (r - l)/2;

            if(nums[mid] == target) {
                last = mid;
                l = mid + 1;
            } else if(nums[mid] > target) {
                r = mid -1;
            } else {
                l  = mid + 1;
            }
        }
        int ans [] = new int[2];

        ans[0] = f;
        ans[1] = last;

        return ans;
    }
}