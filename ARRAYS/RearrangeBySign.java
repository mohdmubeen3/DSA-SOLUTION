public class RearrangeBySign {
    public static void main(String args[]) {
        int arr[] = {2, 3, -4, 6, -9, -5, 12, 13};
        int n = arr.length;

        int neg[] = new int[n];
        int pos[] = new int[n];
        int ans[] = new int[n];

        int p = 0, ne = 0;

         for(int  i = 0; i<n; i++) {
            if(arr[i] > 0) {
                pos[p++] = arr[i];

            } else {
                neg[ne++] = arr[i];
            }
         }

         int i = 0; int j = 0; int k = 0;

          while(i < p && j < ne) {
            ans[k++] = pos[i++];
            ans[k++] = neg[j++];

          }

          while( i < p) {
            ans[k++] = pos[i++];

          } 
          while(j < ne) {
            ans[k++] = neg[j++];
          }
        
        
        for (int x : ans) {
            System.out.print(x + " ");
        }
         
    }
    
}
