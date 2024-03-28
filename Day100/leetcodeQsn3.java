package Day100;

import java.util.HashMap;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/

public class leetcodeQsn3 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        int ans = 0;

        while(j < s.length()){
            if (map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)) + 1, i);
            }

            map.put(s.charAt(j), j);

            ans = Math.max(ans, j-i+1);
            j++;
        }
        return ans;
    }
}
