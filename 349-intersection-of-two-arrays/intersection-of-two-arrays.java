import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set2 = new HashSet<>();
        
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }

        for(int num: nums2){
            if(set.contains(num)){

                set2.add(num);

            }
        }
        int n = set2.size();
        int res [] = new int[n];
        int i = 0;
        for(int ans : set2){
            res[i++] =ans;
        }

        return res;
    }
}