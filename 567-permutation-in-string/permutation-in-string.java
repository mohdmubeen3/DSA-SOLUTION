class Solution {

    public boolean xyz(int arr[], int arr2[]){
        int n = arr.length;
        for(int i = 0; i<26; i++){
            if(arr[i] != arr2[i]){
                return false;
            }
        }


        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int freq[] = new int[26];

        int n = s1.length();
        
        for(int i = 0; i<s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
        }

        int l = 0; 
        int  r = 0;
        int [] freq2 = new int[26];

        while(r < s2.length()){
            freq2[s2.charAt(r) - 'a']++;

            if(r - l + 1 > n){
                freq2[s2.charAt(l) - 'a']--;
                l++;
            }

            if(r - l + 1 == n){
                if(xyz(freq, freq2)){
                    return true;
                }
            }

            r++;
        }

        return false;
    }
}