public class MissingNo {
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,6,7,8,9,10};
        int n = arr.length + 1; // Since one number is missing
        //int totalSum = n * (n + 1) / 2;
        //int actualSum = 0;
        //for(int i = 0; i < arr.length; i++) {
          //  actualSum += arr[i];
        //}
        //int missing = totalSum - actualSum;
        //System.out.println(missing + " is the missing number");

        //using hashing
        //int n = arr.length + 1;
        //int [] hash = new int [n+1];
       // for(int i =0; i<arr.length; i++) {
         //   hash[arr[i]]++;
       // }
        //for(int j = 1; j< hash.length; j++) {
          //  if(hash[j] == 0) {
           //     System.out.println(j + " is the missing number");
           // }
       // }


       //using xor
       
        int xor = 0;

        // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }

        // XOR all elements in the array
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }

        System.out.println(xor + " is the missing number");
    }
}

