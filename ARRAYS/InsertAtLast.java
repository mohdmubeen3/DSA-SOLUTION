public class InsertAtLast {
    public static void main(String args[]){
        int [] arr = {12,13,14,16,0};
        int n = 4;
        int element = 18;
        arr[n] = element;
        for(int i = 0; i <= n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
