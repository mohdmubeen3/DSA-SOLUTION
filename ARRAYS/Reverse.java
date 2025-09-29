public class Reverse {
   //by recursion
    static void reverse(int[] arr, int n, int i, int j){
         
        if(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            reverse(arr, n, i+1, j-1);
        }
    }

    public static void main(String args[]){
        int [] arr = {23,4,6,7,8};
        reverse(arr,arr.length, 0, arr.length-1);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        

    }
    
}
