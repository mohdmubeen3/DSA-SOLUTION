import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> list = new ArrayList<>();
        int freq[] = new int[1001];

        for(int i = 0; i<nums1.length; i++){
            freq[nums1[i]]++;
        }

        for(int i =0; i<nums2.length; i++){
            if(freq[nums2[i]] > 0){
                list.add(nums2[i]);

                freq[nums2[i]]--;
            }
        }

        int n = list.size();
        int ans[] = new int[n];

        for(int i = 0; i<n; i++){
            ans[i] = list.get(i);
        }

        return ans;
        
        
    }
}