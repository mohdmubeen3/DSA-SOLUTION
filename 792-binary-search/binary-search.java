class Solution {


    public static int ans(int[] arr, int low, int high, int x){
        if(low > high ) return -1;

        int mid = (low + high)/2;
        if(arr[mid] == x ){
            return mid;
        } else if(arr[mid] > x){
            return ans(arr, low, mid - 1, x);
        } else {
            return ans(arr, mid + 1, high, x);
        }
    }
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;


        return ans(nums, low, high, target);
        
       
    }
}