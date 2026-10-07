class Solution {
    public int thirdMax(int[] nums) {
        Long f = null;
        Long s = null;
        Long t = null;

        for(int i = 0; i<nums.length; i++){
            long n = nums[i];

            if((f != null && n == f ) || (s != null && s == n) || (t != null && n == t)){
                continue;
            } else if(f == null || n > f){
                t = s;
                s = f;
                f = n;
            } else if(s == null || n > s && n != f){
                t = s;
                s = n;
            } else if(t == null || n > t && n != s){

                t = n;
            }
        }


        if(t == null) return f.intValue();
        else return t.intValue();


    }
}