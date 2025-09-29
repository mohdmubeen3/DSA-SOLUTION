public class BinarySearch {
    public static void main(String args[]) {

        int arr [] = {1,2,3,4,6,9,12,15,16,18,21};
        int low = 0;
        int high = arr.length - 1;
        int target = 16;
        int mid = -1;
        while (low <= high) {

            mid = (low + high) / 2;
            if(arr[mid] == target) {
                System.out.println("Element found at index " + mid);
                return;
            } else if(arr[mid] < target) {
                low = mid + 1;
            }  else {
                high = mid - 1;

            }
            
        }
        System.out.println("Element not found");

    }
    
}
