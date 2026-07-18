class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int n = nums.length;
        int ans[] = new int[2];

        for (int i = 0; i < n; i++) {
            int more = target - nums[i];
            if (mpp.containsKey(more)) {
                ans[0] = mpp.get(more);

                ans[1] = i;

                if (ans[1] > ans[1]) {
                    int temp = ans[0];

                    ans[0] = ans[1];
                    ans[1] = temp;
                }


                return ans;
            }

            mpp.put(nums[i], i);
        }

        return ans;  
    }
}