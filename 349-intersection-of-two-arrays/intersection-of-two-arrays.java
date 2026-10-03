import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int num: nums1){
            set.add(num);
        }
        int j = 0;
        for(int i = 0; i<m; i++){
            if(set.contains(nums2[i])){

                set2.add(nums2[i]);

            }
        }

        int s = set2.size();
        int res []= new int[s];

        for(int ans1:set2){
            res[j++] = ans1;
        }

        return res;
    }
}