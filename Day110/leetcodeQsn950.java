package Day110;

import java.util.Arrays;

// https://leetcode.com/problems/reveal-cards-in-increasing-order/

public class leetcodeQsn950 {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        int[] ans = new int[n];
        
        boolean skip = false;
        
        int deckIndex = 0; 
        int ansIndex = 0;
        
        Arrays.sort(deck);
        
        while (deckIndex<n) {
            if (ans[ansIndex] == 0) { // There is an available gap
                if (!skip) {
                    ans[ansIndex] = deck[deckIndex];
                    deckIndex++;
                }
                
                skip = !skip; //skip to alternate between adding and skipping cards
            }
            
            ansIndex = (ansIndex+1) % n;
        }
        
        return ans;
    }
}
