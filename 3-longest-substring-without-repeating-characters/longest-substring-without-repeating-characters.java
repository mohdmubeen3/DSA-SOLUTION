import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int n = s.length();

        int l = 0;
        int r = 0;
        int max = 0;

        while(r < n){
            if(set.contains(s.charAt(r))){

                while(set.contains(s.charAt(r))){
                    set.remove(s.charAt(l));
                    l++;

                }
                
            }
          
            set.add(s.charAt(r));

           
            max = Math.max(r - l + 1, max);
            r++;
            

        }
        return max;
    }
}