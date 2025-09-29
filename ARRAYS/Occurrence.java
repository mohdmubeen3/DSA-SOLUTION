public class Occurrence {

    static int floor(int arr[] , int x) {
        int lower = 0;
        int high = arr.length - 1;
        int ans = -1;
        while(lower<=high) {
            int mid = lower + (high - lower)/2;
            if(arr[mid] <= x) {
                ans = arr[mid];
                lower = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    static int ceil(int arr[] , int x) {
        int lower = 0;
        int high = arr.length - 1;
        int ans = -1;
        while(lower<=high) {
            int mid = lower + (high - lower)/2;
            if(arr[mid] >= x) {
                ans = arr[mid];
                high = mid - 1;
            } else {
                lower = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String args[]) {
        int arr [] = {1, 2, 3, 4, 5, 3, 6, 3};
        int x = 5;
        System.out.println("the floor value is " + floor(arr, x));
        System.out.println("the ceil value is " + ceil(arr, x));
    }
    
}
