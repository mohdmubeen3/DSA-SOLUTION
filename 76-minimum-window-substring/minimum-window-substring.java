class Solution {
    public String minWindow(String s, String t) {
        int freq [] = new int[128];
        int freq2 [] = new int[26];

        for(int i = 0; i<t.length(); i++){
            freq[t.charAt(i)]++;
        }

        int l = 0;
        int r = 0;
        int start = 0;
        int min = Integer.MAX_VALUE;
        int rem = t.length();
        while(r < s.length()){
            if(freq[s.charAt(r)] > 0){
                

                rem--;

                
            }
            freq[s.charAt(r)]--;

            while(rem == 0){

                if(r - l + 1 < min){
    min = r - l + 1;
    start = l;
}



                freq[s.charAt(l)]++;
                

                if(freq[s.charAt(l)] > 0){
                       rem++;
               }
                l++;



            }
            r++;
        }

        if(min == Integer.MAX_VALUE) return "";
        else return s.substring(start, start + min);
    }
}