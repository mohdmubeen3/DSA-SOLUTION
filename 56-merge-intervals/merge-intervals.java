import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        ArrayList<List<Integer>> list = new ArrayList<>();
        for(int [] interval : intervals){

            if(list.isEmpty() || list.get(list.size() - 1 ).get(1) < interval[0] ){
                list.add(Arrays.asList(interval[0], interval[1]));
            } else {
                int end = list.size() - 1;
                int max = Math.max(interval[1], list.get(end).get(1));
                list.get(end).set(1,max);
            }



        }

        int n = list.size();

        int ans[][] = new int[n][2];

        for(int i = 0; i<n; i++ ){
            ans[i][0] = list.get(i).get(0);
            ans[i][1] = list.get(i).get(1);
        }


        return ans;
        
    }
}