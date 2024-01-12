package Day24;

import java.util.Arrays;

// https://leetcode.com/problems/valid-anagram/

public class leetcodeQsn242 {
    public boolean isAnagram(String s, String t) {
        int[] charCountInS = new int[26];
        int[] charCountInT = new int[26];

        for(char ch : s.toCharArray()){
            charCountInS[ch-'a']++;
        }
        for(char ch : t.toCharArray()){
            charCountInT[ch-'a']++;
        }
        return Arrays.equals(charCountInS,charCountInT);
    }
}
