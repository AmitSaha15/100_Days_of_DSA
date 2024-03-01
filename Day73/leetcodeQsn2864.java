package Day73;

// leetcode.com/problems/maximum-odd-binary-number/

public class leetcodeQsn2864 {
    public String maximumOddBinaryNumber(String s) {
        int ones = 0;
        for(int i=0; i<s.length(); i++){ //count the number of ones
            if(s.charAt(i) == '1') ones++;
        }
        int zeros = s.length() - ones;
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<ones-1 ;i++){ //ones-1 --> one '1' to add at the last position
            ans.append("1");
        }
        for(int i=0; i<zeros; i++){
            ans.append("0");
        }
        ans.append("1"); //adding one '1' in the last position

        return ans.toString();
    }
}
