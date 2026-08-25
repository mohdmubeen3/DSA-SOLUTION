class Solution {

    public boolean matches(int[] arr, int[] arr2){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] !=arr2[i]) return false;
        }


        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int freq1 [] = new int[26];
        int freq2[] = new int[26];

        for(int i = 0; i<26; i++){
            freq1[i] = 0;
        }

        for(int i = 0; i<s1.length(); i++){
            freq1[s1.charAt(i) - 'a']++;
        }

        int l = 0;
        int r = 0;
        int cnt = 0;
        int n = s1.length();
        while(r < s2.length()){
          
                freq2[s2.charAt(r) - 'a']++;
                 if(r - l + 1 > n){

                    freq2[s2.charAt(l) - 'a']--;
                    l++;
                }

                if(r -l + 1 == n){

                    if(matches(freq1, freq2)) return true;
                }


                 r++;

              

                

              

               

        }
           
        
        return false;
    }

    
}