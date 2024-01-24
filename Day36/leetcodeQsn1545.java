package Day36;

// https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/

public class leetcodeQsn1545 {
    public char findKthBit(int n, int k) {
        return formString("0", n, k);
    }

    char formString(String str, int n, int k) {
        if (str.length() >= k) return str.charAt(k - 1);
        return formString(str + "1" + reverseInvert(str), n - 1, k);
    }
    
    String reverseInvert(String s) {
        StringBuilder sb = new StringBuilder("");
        for (char c : s.toCharArray()) {
            if (c == '0')
                sb.append('1');
            else 
                sb.append('0');
        }
        return sb.reverse().toString();
    }
}
