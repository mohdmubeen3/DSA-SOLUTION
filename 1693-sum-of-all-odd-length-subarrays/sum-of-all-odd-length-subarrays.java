class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int res = 0;
        for(int i = 0; i<n; i++){
            double fre = Math.ceil(((i + 1) * (n - i))/2.0);

            res += (int)(fre * arr[i]);

        }

        return res;
    }
}