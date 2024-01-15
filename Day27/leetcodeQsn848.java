package Day27;

// https://leetcode.com/problems/shifting-letters/

public class leetcodeQsn848 {
    public String shiftingLetters(String s, int[] shifts) {
        int n = s.length();
        // int[] prefixSum = new int[n];
        // prefixSum[n-1] = shifts[n-1];
        // for(int i=n-2; i>=0; i--){
        //     prefixSum[i] = (prefixSum[i+1] + shifts[i]) % 26;
        // }

        int sum = 0;
        char[] ch = s.toCharArray();
        for(int i=n-1; i>=0; i--){
            sum += shifts[i] % 26;
            ch[i] = (char)(((ch[i] - 'a') + sum) % 26 + 'a');
        }

        return new String(ch);
    }
}
