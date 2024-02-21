package Day64;

// leetcode.com/problems/maximum-number-of-words-found-in-sentences/

public class leetcodeQsn2114 {
    public int mostWordsFound(String[] sentences) {
        int maxWord = 0;

        for(String str : sentences){
            int wordLen = str.split(" ").length;
            maxWord = Math.max(maxWord, wordLen);
        }

        return maxWord;
    }
}
