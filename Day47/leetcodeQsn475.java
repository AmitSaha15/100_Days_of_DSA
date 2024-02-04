package Day47;

import java.util.Arrays;

// https://leetcode.com/problems/heaters/

public class leetcodeQsn475 {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int radius = 0;
        for(int house : houses){
            radius = Math.max(radius, closestDist(house, heaters)); 
            // the max value of the min distances we found will be our answer i.e. the radius
        }
        return radius;
    }

    // find the min distance between a house and a heater using binary search
    int closestDist(int house, int[] heaters){
        int left = 0;
        int right = heaters.length-1;
        int minDist = Integer.MAX_VALUE;
        while(right >= left){
            int mid = (left + right) / 2;
            minDist = Math.min(minDist, Math.abs(heaters[mid] - house));
            if(heaters[mid] < house){
                left = mid+1;
            } else{
                right = mid-1;
            }
        }
        return minDist;
    }
}
