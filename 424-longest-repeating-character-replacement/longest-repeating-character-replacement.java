import java.util.*;
class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int n = s.length();
        int r = 0;

        int [] freq = new int[26];
        int maxFreq = 0;
        int ans = 0;

        while(r < n){

            freq[s.charAt(r) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(r) - 'A']);

            while((r - l + 1) - maxFreq  > k ){
                freq[s.charAt(l) - 'A']--;
                l++;
            }

            ans = Math.max(ans, r-l+1);

            r++;

            
        }

        return ans;


    }
}