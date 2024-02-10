package Day53;

// https://leetcode.com/problems/merge-strings-alternately/

public class leetcodeQsn1768 {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        StringBuilder ans = new StringBuilder();
        
        for(int i=0; i<len1+len2; i++){
            if(i<len1){
                ans.append(word1.charAt(i));
            }
            if(i<len2){
                ans.append(word2.charAt(i));
            }
            i++;
        }

        return ans.toString();
    }
}
