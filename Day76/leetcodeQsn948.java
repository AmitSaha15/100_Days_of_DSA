package Day76;

import java.util.Arrays;

// https://leetcode.com/problems/bag-of-tokens/

public class leetcodeQsn948 {
    public int bagOfTokensScore(int[] tokens, int power) {
        int ans = 0, score = 0;
        Arrays.sort(tokens);
        int l = 0; //points to the lowest token
        int r = tokens.length-1; //points to the largest token

        while(r >= l){
            if(power >= tokens[l]){ //play the lowest token face up when we have enough power
                power -= tokens[l];
                score += 1;
                l++;
                ans = Math.max(ans, score); //keeping track of the max score
            } else if(score > 0){ //when we don't have enough power to play a token face up
                // but there is at least one token remaining, and we have score>0 then we play
                // the highest token face down
                power += tokens[r];
                score -= 1;
                r--;
            } else{ //when we don't have enough power,score or no tokens remaining break out of the loop
                break;
            }
        }
        return ans;
    }
}
