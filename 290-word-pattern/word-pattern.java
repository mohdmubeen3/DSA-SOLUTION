import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {


        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        String words [] = s.split(" ");

        if(pattern.length() != words.length) return false;

        for(int i = 0; i< pattern.length(); i++){
            char c = pattern.charAt(i);
            String s1 = words[i];

            if(map1.containsKey(c) && !map1.get(c).equals(s1)) return false;
            if(map2.containsKey(s1) && map2.get(s1) != c) return false;

            map1.put(c, s1);
            map2.put(s1, c);
        }


        return true;
    }
}