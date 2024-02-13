package Day56;

// https://leetcode.com/problems/find-first-palindromic-string-in-the-array/

public class leetcodeQsn2108 {
    // 1ms run time
    public String firstPalindrome(String[] words) {
        for(String str : words){
            if(isPalindrome(str)) return str;
        }
        return "";
    }

    public boolean isPalindrome(String str){
        int start = 0;
        int end = str.length()-1;
        while(end>=start){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // 2ms runtime
    
    // public String firstPalindrome(String[] words) {
    //     for (int i = 0; i < words.length; i++) {
    //         String word = words[i];
            
    //         int start = 0;
    //         int end = word.length()-1;
    //         while (word.charAt(start) == word.charAt(end)) {
    //             if (start >= end)
    //                 return word;
    //             else {
    //                 start++;
    //                 end--;
    //             }
    //         }
    //     }
    //     return "";
    // }
}
