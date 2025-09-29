import java.util.*;
public class HashingExample {
    public static void main(String args[]){
        int [] arr = {12,4,8,5,4,12,8};
        int n = arr.length;
        //printing array
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        //precomputing 
        int []  hash = new int[100];
        for(int i =0; i<n; i++){
            hash[arr[i]]++;
        }

        //queries;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of queries");
        int q = sc.nextInt();
        while(q-- > 0){
            System.out.println("Enter the number to be searched");
            int x = sc.nextInt();
            System.out.println(x + " occurs " +hash[x] +" "+ "times");
        }
    }
    
}
