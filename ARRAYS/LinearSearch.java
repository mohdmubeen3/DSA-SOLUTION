public class LinearSearch {
    public static int Linear(int [] nums, int target){
        for(int i = 0; i< nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int [] nums = {23,45,67,89,12,34};
        int target = 12;
        System.out.println(Linear(nums, target));

    }
    
}
