public class RemoveDuplicates {
    public static void main(String args[]) {
        int arr[] = {2,2,3 ,4 ,4,5 };
        int i = 0; 
        for(int j = 1; j<arr.length; j++ ) {
            if(arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        int k = i+1;
        for(int j = 0; j<k; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
