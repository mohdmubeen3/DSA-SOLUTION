class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
       

       int sum = 0;
       int odd = 0;

       int n = arr.length;

       for(int i =0; i<n; i++){

       int  total = (i + 1) * (n - i);
       if(total % 2 == 0) odd = total/2;
       else odd = (total +  1)/2;

       sum += odd * arr[i];

       }
      

       

       return sum;

    }
}