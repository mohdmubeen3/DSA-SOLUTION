import java.util.*;
class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>(); 
        HashMap<Character,Integer> window = new HashMap<>();
        for(int i = 0; i<t.length(); i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }
        int required = map.size();
        int formed = 0;
        int l = 0;
        int min = Integer.MAX_VALUE;
        int start = 0;
        for(int r = 0; r<s.length(); r++){
            char c = s.charAt(r);
            if(map.containsKey(c)){
                window.put(c, window.getOrDefault(c, 0) + 1);
                if(window.get(c).equals(map.get(c))){
                    formed += 1;
                }

               
            }
             while(formed == required){
                   if(r - l + 1 < min){
                    min = r - l + 1;
                    start = l;

                   }
                 char left = s.charAt(l);
                 if (map.containsKey(left)) {

                  window.put(left, window.get(left) - 1);
                   if (window.get(left) < map.get(left)) {
                        formed--;
                    }
                    
                 }
                 l++;
                }
             

        }
         if (min == Integer.MAX_VALUE)
            return "";

        return s.substring(start, start + min);

    }
}