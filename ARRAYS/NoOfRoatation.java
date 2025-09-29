public class NoOfRoatation {
    public static void main(String args[]) {
        int arr []  = {4,5,6,7,1,2,3};
        //index of min = no of the times array has been rotated 
        int low = 0;
        int high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while(low <= high) {
            int mid = (low + high)/2;
            if(arr[low] <= arr[high]) {
                if(arr[low] < arr[mid]) {
                    index = low;
                    ans = arr[low];
                    break;
                } 
            }
            if(arr[low] <= arr[mid]) {
                if(arr[low] < arr[mid] ) {
                    index = low;
                    ans = arr[mid];                               
                }                                    
                low = mid + 1;
            } else if (arr[mid] < arr[low]) { 
                index = mid;
                ans = arr[mid];
                high = mid - 1;

            }
        }
        System.out.println(ans + " " + index);
    }
    
}
