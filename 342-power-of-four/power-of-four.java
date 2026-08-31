class Solution {
    public boolean isPowerOfFour(int n) {

        if(n <= 0) return false;
        

        while((n & 3) == 0){

            
          
            n = n >> 2;

        }
        
        

        return n == 1;
    }
}