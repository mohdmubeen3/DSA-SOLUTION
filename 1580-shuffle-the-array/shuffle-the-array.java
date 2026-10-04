class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[2*n];

        int i = 0;

        int j = 0;
        int k = n;

        while(j < n && k < 2*n){
            ans[i++] = nums[j++];
            ans[i++] = nums[k++];
        }

        return ans;
        
    }
}