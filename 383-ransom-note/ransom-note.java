import java.util.*;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        char [] freq = new char[128];

        for(int i = 0; i<ransomNote.length(); i++){
            freq[ransomNote.charAt(i) - 'a']++;
        }

        for(int i = 0; i<magazine.length(); i++){
            if(freq[magazine.charAt(i) - 'a'] > 0){
                freq[magazine.charAt(i) - 'a']--;

            }
        }

        for(int i = 0; i<128; i++){
            if(freq[i] > 0) return false;
        }

        return true;
        
    }
}