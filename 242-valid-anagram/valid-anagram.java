class Solution {
    public boolean isAnagram(String s, String t) {
        int [] map = new int[128];
        for(int i= 0; i<s.length(); i++){
            map[s.charAt(i) - 'a']++;
        }

        int [] map2 = new int[128];

        for(int i = 0; i<t.length(); i++){
            map[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i<128; i++){
            if(map[i] != 0) return false;
        }

        return true;

    }
}