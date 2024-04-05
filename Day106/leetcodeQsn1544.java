package Day106;

// https://leetcode.com/problems/make-the-string-great/

public class leetcodeQsn1544 {
    public String makeGood(String s) {
        StringBuilder ans = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(ans.length()>0 && (ch+32 == ans.charAt(ans.length()-1) || ch-32 == ans.charAt(ans.length()-1))){
                ans.deleteCharAt(ans.length()-1);
            } else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
