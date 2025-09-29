class QuickSort {
    
    
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            
            int pivotIndex = partition(arr, low, high);

            // Recursively sort left and right parts
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

     
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];  
        int i = low + 1;
        int j = high;

        while (i <= j) {
            
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
           
            while (j >= low && arr[j] > pivot) {
                j--;
            }
            
            if (i < j) {
                swap(arr, i, j);
            }
        }

        
        swap(arr, low, j);

        return j;  
    }

    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    
    public static void main(String[] args) {
        int[] arr = {24, 9, 29, 14, 19, 27};
        

        quickSort(arr, 0, arr.length - 1);

       
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
