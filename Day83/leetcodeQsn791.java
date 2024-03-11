package Day83;

import java.util.Arrays;
import java.util.Comparator;

// https://leetcode.com/problems/custom-sort-string/

public class leetcodeQsn791 {
    public String customSortString(String order, String s) {
        // using custom comparator

        Integer[] index = new Integer[26];
        Arrays.fill(index,-1);

        for(int i=0; i<order.length(); i++){ //map chars to their positions in `order`
            char currChar = order.charAt(i);
            index[currChar-'a'] = i;
        }
        // custom comparator for sorting the string
        Comparator<Character> myComp = (ch1, ch2) -> index[ch1-'a'].compareTo(index[ch2-'a']);

        // converting the given string `s` in Character array
        // s.toCharArray() doesn't work here because it's return char array
        // we are working with the Character class here 
        Character[] charArr = new Character[s.length()];
        for(int i=0; i<s.length(); i++){
            charArr[i] = s.charAt(i);
        }
        Arrays.sort(charArr, myComp);

        StringBuilder ans = new StringBuilder();
        for (char ch : charArr) {
            ans.append(ch);
        }
        return ans.toString();

        // using frequency of each char --->

        // int[] freq = new int[26];

        // for (char ch : s.toCharArray()){
        //     freq[ch-'a']++;
        // }

        // StringBuilder ans = new StringBuilder();

        // for (char ch : order.toCharArray()) {
        //     while (freq[ch-'a']-- > 0) {
        //         ans.append(ch);
        //     }
        // }

        // for (char ch : s.toCharArray()) { // adding the chars which are not present in `order` array
        //     if (freq[ch-'a'] > 0) {
        //         ans.append(ch);
        //     }
        // }

        // return ans.toString();
    }
}
