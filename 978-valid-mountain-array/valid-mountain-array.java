class Solution {
    public boolean validMountainArray(int[] arr) {

        int l = 0; 
        int r = arr.length - 1;

        int n = arr.length;
        if(arr.length < 3){
            return false;
        } else {

           

          
                while(l+1 < n && arr[l+1] > arr[l]){
                    l++;

                }
                while(r - 1 >= 0 && arr[r] < arr[ r -1]){
                    r--;
                }
            
        }

        if(l > 0 && r < n-1 && l == r) return true;
        return false;


    }
}