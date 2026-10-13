import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        Stack<Integer> st = new Stack<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = m-1; i>=0; i--){

            while(!st.isEmpty() && st.peek() <= nums2[i]){
                st.pop();
                

            } 

            if(st.isEmpty()){
                map.put(nums2[i], -1);

            } else {
                map.put(nums2[i], st.peek());
            }
               
            

            st.push(nums2[i]);
        }

        for(int i = 0; i<n; i++){
            if(map.containsKey(nums1[i])){
                nums1[i] = map.get(nums1[i]);
            }
        }

        return nums1;
    }
}