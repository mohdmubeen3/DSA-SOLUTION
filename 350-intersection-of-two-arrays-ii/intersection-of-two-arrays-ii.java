import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int ans [] = new int[n];
        int i = 0; 
        int j = 0; 
        int k = 0; 

        while(i < n && j <m){
            if(nums1[i] == nums2[j]){
                ans[k++] = nums1[i];
                i++;
                j++;
            } else if(nums1[i] > nums2[j]){
                j++;
            } else {
                i++;
            }
        }

        return Arrays.copyOf(ans, k);
        
        
    }
}