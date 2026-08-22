import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int e1 = 0;
       int c1 = 0;
       int e2 = 0;
       int c2 = 0;

       for(int i = 0; i<nums.length; i++){
       if(nums[i] == e1){
        c1++;
       } else if(nums[i] == e2){
        c2++;
       } else if(c1 == 0){
        e1 = nums[i];
        c1 =1;
       } else if(c2 == 0){
        e2 = nums[i];
        c2 = 1;
       } else {
        c1--;
        c2--;
       }
       }

       int cnt1= 0;
       int cnt2 = 0;

       for(int i = 0; i<nums.length; i++){
        if(nums[i] == e1) cnt1++;
        else if(nums[i] == e2) cnt2++;
       }

       ArrayList<Integer> list = new ArrayList<>();

       if(cnt1 > nums.length / 3) list.add(e1);
       

       if(cnt2 > nums.length / 3) list.add(e2);

       Collections.sort(list);

       return list;

    }
}