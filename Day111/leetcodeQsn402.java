package Day111;

// https://leetcode.com/problems/remove-k-digits/

public class leetcodeQsn402 {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        StringBuilder ans = new StringBuilder();
        
        for(int i=0; i<n; i++) {
            while(ans.length()>0 && ans.charAt(ans.length()-1) > num.charAt(i) && k > 0) {
                ans.deleteCharAt(ans.length()-1);
                k--;
            }
            
            if(ans.length()>0 || num.charAt(i) != '0') {
                ans.append(num.charAt(i)); //when we have preceding zeros
            }
        }
        
        while(ans.length() > 0 && k>0) {
            ans.deleteCharAt(ans.length()-1);
            k--;
        }
        
        return ans.length() == 0 ? "0" : ans.toString();
    }
}
