import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l = 0;
        int r = 0; 
        int max = 0; 
        int n = s.length();

        while(r < n){
           
            while(set.contains(s.charAt(r))){

                set.remove(s.charAt(l));

                l = l + 1;
            
            }

            max = Math.max(max, r - l + 1);

            set.add(s.charAt(r));

            r++;
        }

        return max;
    }
}