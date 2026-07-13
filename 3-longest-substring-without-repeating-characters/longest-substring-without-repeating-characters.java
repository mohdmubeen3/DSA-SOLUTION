class Solution {
    public int lengthOfLongestSubstring(String s) {
        int [] haveSeen = new int[128];
        int n = s.length();
        for(int i = 0; i<128; i++) {
            haveSeen[i] = -1;
        }

        int left = 0;
        int length = 0;
        int right = 0;
        while(right < n) {
            char ch = s.charAt(right);
            if(haveSeen[ch] >= left) {
                left = haveSeen[ch] + 1;
            }
            haveSeen[ch] = right;
            length = Math.max(length, right - left + 1);
            right++;

        }
        return length;
    }
}