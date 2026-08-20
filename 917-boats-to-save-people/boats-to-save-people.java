import java.util.*;
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l =0;
        int r = people.length - 1;
        int cnt = 0;

        while(l<=r){

            if(l ==r){
                if(people[l] <= limit){

                    cnt++;
                    break;

                }
            }
            if((people[l] + people[r]) > limit){
                 if(people[r] <= limit){
                    cnt++;
                    r--;
                 }
            } else {
                cnt++;
                l++;
                r--;
            }
        }

        return cnt;
    }
}