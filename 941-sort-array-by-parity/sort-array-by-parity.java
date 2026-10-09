class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int res[] = new int[nums.length];

        int j = 0;

        // for(int i = 0; i<nums.length; i++){
        //     if(nums[i] % 2 == 0){
        //         res[j++] = nums[i];
        //     }
        // }
        // for(int i = 0; i<nums.length; i++){
        //     if(nums[i] % 2 == 1){
        //         res[j++] = nums[i];
        //     }
        // }

        // return res;

        int l  =0;
        int r= nums.length - 1;

        while(l < r){
            if(nums[l] % 2 > nums[r] % 2){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                r--;
                l++;
            } 

            if(nums[l] % 2== 0) l++;
            if(nums[r] % 2 == 1) r--;
        }

        return nums;

    }
}