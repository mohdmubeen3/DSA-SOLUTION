import java.util.*;
class Solution {
    public long pickGifts(int[] gifts, int k) {

       PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int gift : gifts){
            minHeap.offer(gift);
        }

        for(int i = 0; i<k; i++){
            int insert = (int) Math.sqrt(minHeap.poll());
            minHeap.offer(insert);
        }

        long total = 0;
        while(!minHeap.isEmpty()){
           total += minHeap.poll();
        }
        return total;
    }
}