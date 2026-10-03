import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       int freq [] = new int[1001];
       int n = nums1.length;
       int m = nums2.length;
       for(int i = 0; i<n; i++){

        freq[nums1[i]] = 1;
       }

       int cnt = 0;

       for(int i = 0; i<m; i++){
        if(freq[nums2[i]] == 1){
            freq[nums2[i]] =2;
            cnt++;
        }

       }
       int res [] = new int[cnt];
       int i = 0;
       for(int j = 0; j<1001; j++){
        if(freq[j] == 2){
            res[i++] = j;
        }
       }

       return res;


    }
}