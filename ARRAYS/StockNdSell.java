public class StockNdSell {
    public static void main(String args[]) {
        int arr[] = {7,1,3,5,6,8};
        // int minPrice = Integer.MAX_VALUE;
        int maxPro = 0;
        for(int i =0; i<arr.length; i++) {
            for(int j = i+ 1; j<arr.length; j++){
                if(arr[j] > arr[i]) {
                    maxPro = Math.max(arr[j] - arr[i], maxPro);
                }
            }
        }
         System.out.println(maxPro);
 }

 }
