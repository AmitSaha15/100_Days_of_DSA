package Day45;

// https://leetcode.com/problems/to-lower-case/

public class leetcodeQsn709 {
    public String toLowerCase(String s) {
        StringBuilder ans = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(ch >= 'A' && ch <= 'Z'){
                ch = (char)((int)ch+32);
            }
            ans.append(ch);
        }

        return ans.toString();
    }
}
