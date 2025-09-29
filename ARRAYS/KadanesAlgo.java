public class KadanesAlgo {
    public static void main(String args[]) {
        int arr[] = {1,-2,3,4};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int ansStart = -1;
        int ansend = -1;
        for(int i = 0; i<arr.length; i++) {
            if(sum == 0) {
                start = i;
            }
            sum = sum + arr[i];

            if(sum > max) {
                max = sum;
                ansStart = start;
                ansend = i;
            }
            if(sum < 0) {
                sum = 0 ;
            }
        }
        System.out.println(max);
        for(int i = ansStart; i<=ansend; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
