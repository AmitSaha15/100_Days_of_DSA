package Day39;

// https://leetcode.com/problems/maximum-repeating-substring/

public class leetcodeQsn1668 {
    public int maxRepeating(String sequence, String word) {
        StringBuilder sb = new StringBuilder(word);
        int count = 0;
        while(sequence.contains(sb)){
            count++;
            sb.append(word);
        }
        return count;
    }
}
