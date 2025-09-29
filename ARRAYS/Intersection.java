import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class Intersection {
    public static void main(String args[] ){
        int arr1[] = {2,3,4,5,6,7};
        int arr2 []= {5,6,7,8,9,10};
         Set<Integer> set = new HashSet<>();
         Set<Integer> intersection = new HashSet<>();
         for(int i = 0; i<arr1.length; i++) {
            set.add(arr1[i]);
         }
         for(int j = 0; j< arr2.length; j++) {
            if(set.contains(arr2[j])){
                intersection.add(arr2[j]);
            }
         }
        System.out.println(intersection);
    }
    
}
