package Day100;

// https://leetcode.com/problems/count-the-number-of-consistent-strings/

public class leetcodeQsn1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = words.length;
        int[] charArr = new int[26];

        for (char ch : allowed.toCharArray()){
            charArr[ch-'a']++;
        }

        for (String word : words) {
            for (char ch : word.toCharArray()) {
                if (charArr[ch-'a'] <= 0){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
