import java.util.*;
class Solution {
    public int countSpecialIntegers(int[] nums) {
       int map[] = new int[101];
       map[nums[0]]++;

       for(int i = 1; i<nums.length; i++){
        if(nums[i] != nums[i-1]){
            map[nums[i]]++;
        }
       }
       int res = 0;
       for(int i = 0; i<101; i++){
        if(map[i] == 1) res++;
       }

       return res;

        
    }
}