class Solution {
    public int countPrimes(int n) {
        

       
        boolean[] arr = new boolean[n]; 
        
        
        for (int i = 2; i * i < n; i++) {

            if (arr[i]  == false) {


                
                for (int j = i * i; j < n; j += i) {


                    arr[j] = true; 
                }
            }
        }

    
        int count = 0;


        for (int i = 2; i < n; i++) {
            if (arr[i] == false) {
                count++;
            }
        }

        return count;
    }
}