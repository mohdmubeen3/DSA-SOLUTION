import java.util.HashSet;
import java.util.Set;

public class Union {
    public static void main(String args[] ){
        int [] arr =  {1,2,3,4,5,6,7,8,9};
        int [] arr2 = {5,6,7,8,9,10,11,12,13};
        Set<Integer>set= new HashSet<>();
        for(int i =0; i< arr.length; i++) {
            set.add(arr[i]);
        }
        for(int j = 0; j < arr2.length; j++) {
            set.add(arr2[j]);
        }
        System.out.println(set);
    }
    
}
