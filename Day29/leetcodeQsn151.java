package Day29;

// https://leetcode.com/problems/reverse-words-in-a-string/

public class leetcodeQsn151 {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        StringBuilder ans = new StringBuilder();
        
        for(int i=words.length-1; i>=0; i--){
            if(words[i].isEmpty() == false){
                ans.append(words[i]);
                ans.append(" ");
            }
        }

        return ans.toString().trim();


        // String[] strArr = s.trim().split("\\s+");
        
        // int i=0, j=strArr.length-1;
        // while(j>i){
        //     String temp = strArr[i];
        //     strArr[i] = strArr[j];
        //     strArr[j] = temp;
        //     i++;
        //     j--;
        // }

        // return String.join(" ",strArr);
    }
}
