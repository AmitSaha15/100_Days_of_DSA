package Day3;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

public class leetcodeQsn1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List result = new ArrayList<>();

        int maxCandies = 0;
        for(int i=0; i<n; i++){
            maxCandies = Math.max(maxCandies,candies[i]);
        }

        for(int i=0; i<n; i++){
            if((candies[i]+extraCandies) >= maxCandies){
                result.add(i,true);
            } else{
                result.add(i,false);
            }
        }

        return result;
    }
}
