class Solution {
    public int maximumPopulation(int[][] logs) {
        int []  years = new int[102];
        for(int [] log : logs){
            years[log[0] - 1950]++;
            years[log[1] - 1950]--;
        }
        int pop = 0;
        int max = 0;
        int ans = 1950;
        for(int i = 0; i<= 100; i++){
            pop += years[i];
            if(pop > max){
                max = pop;
                ans = 1950 + i;
            }
        }

        return ans;
    }
}