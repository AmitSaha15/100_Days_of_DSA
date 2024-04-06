package Day107;

// https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/

public class leetcodeQsn1249 {
    public String minRemoveToMakeValid(String s) {
        int openParenCount = 0;
        StringBuilder temp = new StringBuilder();
        
        for(char ch : s.toCharArray()) {
            if(ch == '(') 
                openParenCount++;
            else if(ch == ')') {
                if(openParenCount == 0) continue;

                openParenCount--;
            }
            
            temp.append(ch);
        }
        
        StringBuilder ans = new StringBuilder();
        for(int i=temp.length()-1; i>=0; i--) {
            if(temp.charAt(i) == '(' && openParenCount-- > 0) continue;

            ans.insert(0, temp.charAt(i));
        }
        
        return ans.toString();
    }
}
