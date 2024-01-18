package Day30;

// https://leetcode.com/problems/string-compression/

public class leetcodeQsn443 {
    public int compress(char[] chars) {
        int n = chars.length;
        int count = 1;
        int index = 0;
        for(int i=0; i<n; i++){
            count = 1;
            while(i<n-1 && chars[i] == chars[i+1]){
                count++;
                i++;
            }
            chars[index] = chars[i];
            index++;
            if(count>1){
                for(char ch: Integer.toString(count).toCharArray()){
                    chars[index] = ch;
                    index++;
                }
            }
        }
        return index;
    }
}
