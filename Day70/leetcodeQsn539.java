package Day70;

import java.util.List;

// https://leetcode.com/problems/minimum-time-difference/

public class leetcodeQsn539 {
    public int findMinDifference(List<String> timePoints) {
        boolean[] minComb = new boolean[24*60]; //all possible minutes in 24hrs i.e. 24*60 = 1440

        for(String time : timePoints){
            String[] splitTime = time.split(":"); //"23:59" split at ':' to get the hours ans minutes
            int hour = Integer.parseInt(splitTime[0]);
            int minute = Integer.parseInt(splitTime[1]);

            if(minComb[(hour*60) + minute]) return 0; //if the time is already marked then
            // the min minutes diff is 0 as we found same time twice
            minComb[(hour*60) + minute] = true; //after coverting the time in minutes we
            // are marking that minute in minComb array
        }

        int minDiff = Integer.MAX_VALUE;
        int firstTimeSeen = -1; //we'll loop through the minComb arr and when we see a time 
        // for the first time it will update to that index and leave it so that at the we can 
        // compare the last time and the first time to check if it's lower than the minDiff
        int prevTimeSeen = -1; // it'll update every time we see a new time

        for(int i=0; i<minComb.length; i++){
            if(minComb[i]){
                if(firstTimeSeen == -1){
                    firstTimeSeen = i;
                    prevTimeSeen = i;
                } else{
                    minDiff = Math.min(minDiff, Math.min(i-prevTimeSeen, minComb.length-i+prevTimeSeen));
                    prevTimeSeen = i;
                }
            }
        }
        minDiff = Math.min(minDiff, Math.min(prevTimeSeen-firstTimeSeen, minComb.length-prevTimeSeen+firstTimeSeen));

        return minDiff;
    }
}
