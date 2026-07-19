class Solution {
    public String largestGoodInteger(String num) {
        int r = 0;
        int l = 0;
        int n = num.length();
        int max = -1;
        while(r < n) {
            int d1 = Integer.parseInt(String.valueOf(num.charAt(r)));
            int d2 = Integer.parseInt(String.valueOf(num.charAt(l)));
            if(d1 != d2) {
                l = r;
            }
            

             if((r - l + 1) == 3 ){
                max = Math.max(max, d1);
                

            }

            if((r - l + 1) > 3) {
                l++;
            }
            r++;
           
        }
        if(max == -1) return "";

         return String.valueOf(max).repeat(3);

    }
}