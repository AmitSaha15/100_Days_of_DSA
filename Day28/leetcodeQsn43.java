package Day28;

// https://leetcode.com/problems/multiply-strings/

public class leetcodeQsn43 {
    public String multiply(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();
        if(num1.equals("0") || num2.equals("0")) return "0";

        int[] prod = new int[n1+n2];

        for(int i=n1-1; i>=0; i--){
            for(int j=n2-1; j>=0; j--){
                int digit = ((int)num1.charAt(i)-'0') * ((int)num2.charAt(j)-'0');
                prod[i+j] += (digit + prod[i+j+1])/10;
                prod[i+j+1] = (digit + prod[i+j+1])%10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int elem : prod){
            sb.append(elem);
        }
        if(sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
