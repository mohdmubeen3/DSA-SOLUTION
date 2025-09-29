public class RotateArray {
    static void Rotate(int arr[], int low, int high) {
        while(low <= high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

    }
     public static void main(String args[]) {
        int arr [] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k = 3;
        k = k % n;
        Rotate(arr, 0, k-1);
        Rotate(arr, k, n-1);
        Rotate(arr, 0, n-1);
        for(int i = 0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }


    }
    
}
