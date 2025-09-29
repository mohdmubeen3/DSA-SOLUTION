public class InsertionAtAnyPosition {
    public static void main(String args[]){
         int [] arr = {12,15,18,20,21,0};
         int n = 5;
         int index = 2;
         for(int i = n; i>index; i--){
            arr[i] = arr[i-1];
         }
         arr[index] = 6;
         for(int i =0; i<=n; i++){
            System.out.print(arr[i]+" ");
         }
    }
}
