package Day19;

import java.util.Arrays;

// https://leetcode.com/problems/assign-cookies/

public class leetcodeQsn455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int c = 0;
        for(int i=0; c<g.length && i<s.length; i++){
            if(g[c] <= s[i]){
                c++;
            }
        }
        return c;
    }
}
