import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        // HashSet<Integer> set = new HashSet<>();

        // int n = nums.length;
        

        // for(int num : nums){
            
        //         set.add(num);


           
        // }
        // for(int i = 1; i<=n; i++){
        //     if(!set.contains(i)){
        //         list.add(i);
        //     }
        // }

        for(int i = 0; i<nums.length; i++){
          int idx = Math.abs(nums[i]) - 1;
            
           
            if (nums[idx] > 0) {
                nums[idx] = -nums[idx];
            }

            
        }

        for(int i  =0; i<nums.length; i++){
            if(nums[i] > 0){
                list.add(i+1);
            }
        }

        return list;
    }
}