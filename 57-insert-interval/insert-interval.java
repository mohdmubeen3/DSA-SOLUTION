import java.util.*;
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

       
        ArrayList<List<Integer>> list= new ArrayList<>();

        boolean flag = false;;

        for(int [] interval : intervals){
            if(flag){
                list.add(Arrays.asList(interval[0], interval[1]));
            } else if(interval[1] < newInterval[0]){
                list.add(Arrays.asList(interval[0], interval[1]));

            } else if(interval[0] > newInterval[1]){
                list.add(Arrays.asList(newInterval[0], newInterval[1]));
                list.add(Arrays.asList(interval[0], interval[1]));
                flag = true;
            } else {
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);

            }
        }

        if(!flag){
            list.add(Arrays.asList(newInterval[0], newInterval[1]));
        }


        int n = list.size();

        int res[][] = new int[n][2];

           

          for(int i = 0; i<n; i++){
            res[i][0] = list.get(i).get(0);
            res[i][1] = list.get(i).get(1);
          }

          return res;
    }
}