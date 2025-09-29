public class SecondLargest {
    public static void  main(String args[]){
        int [] arr = {12,2,3,56,78};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++) {
            if(arr[i] >  largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }

            
        }
        if(secondLargest == Integer.MIN_VALUE) {
                System.out.println("No second largest element");
            } else {
                System.out.println("Second largest element is: " + secondLargest);
            }

}
}
