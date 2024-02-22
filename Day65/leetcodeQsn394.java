package Day65;

// https://leetcode.com/problems/decode-string/

public class leetcodeQsn394 {
    int index = 0; 
    public String decodeString(String s) {
        StringBuilder decoded = new StringBuilder();

        while (index < s.length() && s.charAt(index) != ']') {
            
            // when character is a letter of encoded
            if (!Character.isDigit(s.charAt(index))){
                decoded.append(s.charAt(index));
                index++;
            } else{ // when character is number or [ ]
                int k = 0;
                
                // case: number
                while (index < s.length() && Character.isDigit(s.charAt(index))){
                    k = k * 10 + s.charAt(index++) - '0';
                }
                
                // case: [
                index++;
                String answer = decodeString(s);
                
                // case: ]
                index++;
                
                // add k*encoded to decoded
                while (k-- > 0) decoded.append(answer);
            }
        }
        return decoded.toString();
    }
}
