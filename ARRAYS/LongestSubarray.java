public class LongestSubarray {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,0,1,1,1,1};
        int k = 3;
        int right = 0;
        int left = 0;
        int sum = 0;
        int max = 0;
        int n = arr.length;

        for ( right = 0; right < n; right++) {
            sum += arr[right]; // expand window

            // shrink while sum > k
            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            // check if sum == k
            if (sum == k) {
                max = Math.max(max, right - left + 1);
            }
        }

        System.out.println("Longest length = " + max);
    }
}

//import java.util.*;

//public class LongestSubarray {
    //public static void main(String[] args) {
        //int[] arr = {1,1,0,1,1,1,0,1,1,1,1}; 
        //int k = 3;

        //Map<Integer, Integer> map = new HashMap<>();
        //int prefixSum = 0, max = 0;

        //for (int i = 0; i < arr.length; i++) {
          //  prefixSum += arr[i];

            // Case 1: subarray from 0 to i
           // if (prefixSum == k) {
            //    max = Math.max(max, i + 1);
           // }

            // Case 2: subarray ending at i with sum k
            //if (map.containsKey(prefixSum - k)) {
            //    max = Math.max(max, i - map.get(prefixSum - k));
           // }

            // Store first occurrence of prefixSum
            //if (!map.containsKey(prefixSum)) {
            //    map.put(prefixSum, i);
           // }
       // }

        //System.out.println("Longest length = " + max);
    //}
//}

