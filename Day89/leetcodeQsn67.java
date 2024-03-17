package Day89;

// https://leetcode.com/problems/add-binary/

public class leetcodeQsn67 {
    public String addBinary(String a, String b) {
      StringBuilder ans = new StringBuilder();
      int carry = 0;
      int i = a.length() - 1;
      int j = b.length() - 1;

      while (i>=0 || j>=0 || carry==1) {
          if (i>=0){
              carry += a.charAt(i) - '0';
              i--;
          }
          if (j>=0){
              carry += b.charAt(j) - '0';
              j--;
          }

          ans.append(carry%2);
          carry /= 2;
      }

      return ans.reverse().toString();
    }
}
