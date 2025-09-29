public class MostFrequent {
public static void main(String args[]){
    int[] arr = {12,4,8,5,4,12,8};
    int n = arr.length;
    //printing  arry
    for(int i = 0; i<n; i++){
        System.out.print(arr[i] + " ");
    }
    int [] hash = new int[100];

    //pre computing
    for(int i =0; i<n; i++){
        hash[arr[i]] ++;
         
        }

        //find the most frequent element
        int max = -1;
        int ans = -1;

        for(int i =0; i<hash.length; i++){
            if(hash[i] > max){

                max = hash[i];
                ans = i;
            }
        }
        System.out.println(ans + " is the most frequent element");

}
    
}
