package Day42;

// https://leetcode.com/problems/goal-parser-interpretation/

public class leetcodeQsn1678 {
    public String interpret(String command) {
        int n = command.length();
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<n; i++){
            if(command.charAt(i) == 'G'){
                ans.append("G");
            } else if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                ans.append("o");
                i++; // to skip the next char i.e. ")"
            } else{
                ans.append("al");
                i += 3; // need to skip '(al)'
            }
        }
        return ans.toString();
    }
}
