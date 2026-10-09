class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;

        double freq = 0;

        int n = arr.length;

        for(int i = 0; i<arr.length; i++){
            freq = Math.ceil(((i + 1) * (n  - i))/2.0);

            ans += (int) (freq * arr[i]);
        }


        return ans;
    }
}