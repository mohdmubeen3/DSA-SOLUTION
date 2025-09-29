import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String args[]) {
        int arr[] = {3,-3,1,1,1,};
        int n = arr.length;
        int k = 3;
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        int sum = 0;
         int count = 0;
         for(int i = 0; i<n; i++) {
            sum += arr[i];
            int x = sum - k;
            if(mpp.containsKey(x)) {
                count += mpp.get(x);
            }

            mpp.put(sum, mpp.getOrDefault(sum, 0) + 1);
         }
         System.out.println(count);

         
    }
}
