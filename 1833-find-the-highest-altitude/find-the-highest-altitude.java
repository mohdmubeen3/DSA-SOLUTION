class Solution {
    public int largestAltitude(int[] gain) {
        int height = 0;
        int max = Integer.MIN_VALUE;

        for(int num : gain){
            height += num;

            max = Math.max(max, height);
        }

        if(max < 0) return 0;

        return max;
        
    }
}