public class First {
    public static void main(String agrs[]){
        //int arr[] = {2,4,57,89};
        //int sum = 0;
        //for(int i=0; i<arr.length; i++){
          //  System.out.println("the element at index " +i+ " is " + arr[i]);
          //sum += arr[i];

          //if(i % 2 == 0){
            //product *= arr[i];
          //}
          



        //}

        //int avg = sum / arr.length;
        //System.out.println("the average of all the elements of the array is :" +avg);
        //System.out.println("the sum of the all the elements of the array is :" +sum);
        //System.out.println("the product of the elements at even indices is :" +product);

        int arr[] ={2,3,4,5,6};
        int n = arr.length;

        for(int i =n; i>0; i--){
            arr[i] = arr[i-1];
        }

        arr[0] = 1;
        n++;

        for(int i=0; i<n; i++){
            System.out.println(arr[i] + " ");
        }

    }
}

           
        //System.out.println("the sum of the all the elements of the array is :" +sum);


    
