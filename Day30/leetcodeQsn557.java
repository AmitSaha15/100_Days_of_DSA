package Day30;

// https://leetcode.com/problems/reverse-words-in-a-string-iii/

public class leetcodeQsn557 {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder("");

        for(int i=0; i<words.length; i++){
            StringBuilder sb = new StringBuilder(words[i]);
            ans.append(sb.reverse().toString());
            if(i != words.length-1) ans.append(" ");
        }

        return ans.toString();
    }
}
