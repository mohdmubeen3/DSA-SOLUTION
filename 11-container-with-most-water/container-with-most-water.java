class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        
        int max = 0;
        while(l < r ){
            int side = Math.min(height[l], height[r]);
            max = Math.max(max, side * (r - l));

            if(height[l] < height[r]){
                l++;
            } else if(height[l] > height[r]){
                r--;
            } else {
                l++;
                r--;
            }
        }

        return max;
    }
}