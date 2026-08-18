import java.util.*;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> map1 = new HashMap<>();

        List<Integer> res = new ArrayList<>();

        if(s.length() < p.length()) return res;
        for(int i =0; i<p.length(); i++){
            map1.put(p.charAt(i), map1.getOrDefault(p.charAt(i), 0) + 1);
        }

        HashMap<Character, Integer> map2 = new HashMap<>();
        int n = p.length();

        int l  = 0;
        for(int r = 0;r<s.length(); r++){
            char ch = s.charAt(r);

            map2.put(ch, map2.getOrDefault(ch, 0) + 1);

            if(r - l + 1 > p.length()){
                char left = s.charAt(l);

                map2.put(left, map2.get(left) - 1);

                if(map2.get(left) == 0){
                    map2.remove(left);
                }

                l++;

            }

            if(map1.equals(map2)){
                res.add(l);
            }

             



        }

        return res;

    }
}