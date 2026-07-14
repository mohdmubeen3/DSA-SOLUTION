import java.util.*;
class Solution {
    public String sortVowels(String s) {
        char[] arr = s.toCharArray();
        List<Character> v = new ArrayList<>();
        Map<Character, Integer> first = new HashMap<>();
        
        int [] f = new int[26];
        for(int i = 0; i<arr.length; i++) {
            char c = arr[i];
            if("aeiou".indexOf(c) != -1) {


                v.add(c);
                f[c-'a']++;
                first.putIfAbsent(c, i);
            }
        }
        
        Collections.sort(v, (a, b) -> {
            if(f[b - 'a'] != f[a - 'a']) 
                return f[b - 'a'] - f[a - 'a'];
            return first.get(a) - first.get(b);
        });
        int i = 0;
        for(int j = 0; j<arr.length; j++ ) {
            if("aeiou".indexOf(arr[j]) != -1){
                arr[j] = v.get(i++);
            }
        }
        return new String(arr);
    }
}