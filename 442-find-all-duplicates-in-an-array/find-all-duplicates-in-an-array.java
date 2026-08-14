import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> list = new ArrayList<>();

        for(int num : nums){
            int idx = Math.abs(num) - 1;
            if(nums[idx] < 0){
                list.add(idx + 1);
            } else {

                nums[idx] *= -1;

            }
        }

        return list;
    }
}