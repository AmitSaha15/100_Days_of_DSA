package Day25;

// https://leetcode.com/problems/sentence-similarity-iii/

public class leetcodeQsn1813 {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {

        if (sentence1.length() < sentence2.length()) {
            return areSentencesSimilar (sentence2, sentence1);
        }

        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");

        int i = 0;
        int len1 = words1.length - 1;
        int len2 = words2.length - 1;
        while(i<words2.length && words1[i].equals(words2[i])){
            i++;
        }
        while(len2 >= 0 && words1[len1].equals(words2[len2])){
            len1--;
            len2--;
        }
        return i > len2;
    }
}
