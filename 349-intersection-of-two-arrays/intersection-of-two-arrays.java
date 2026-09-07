class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] mp = new int[1001];

     
        for (int num : nums1) {
            mp[num] = 1;
        }

        int cnt = 0;

   
        for (int num : nums2) {
            if (mp[num] == 1) {
                mp[num] = 2;
                cnt++;
            }
        }

        int[] res = new int[cnt];
        int idx = 0;

        for (int i = 0; i < 1001; i++) {
            if (mp[i] == 2) {
                res[idx++] = i;
            }
        }

        return res;
    }
}