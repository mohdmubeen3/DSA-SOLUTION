class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 1;
        int elem = nums[0];

        

        for(int i = 1; i<nums.length; i++){
            int current = nums[i];
            if(current != elem){
                cnt--;
            } else {
                cnt++;
            }

            if(cnt == 0){
                elem = current;
                cnt = 1;
            }
            
        }
       

       return elem;
    }
}