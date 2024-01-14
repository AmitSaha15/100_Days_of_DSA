package Day26;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

public class leetcodeQsn28 {

    // Brute force (better runtime)
    public int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
    
        if(len2 > len1) return -1;
    
        for (int i=0; i<=len1-len2 ; i++){
            if (haystack.substring(i, i + len2).equals(needle)){
                return i;
            }
        }
    
        return -1;
    }


    // Using KMP algorithm
    // void computeLPS(String str, int lps[]){
    //     int len = 0;
    //     int i = 1;
    //     lps[0] = 0;
 
    //     while (i < str.length()) {
    //         if (str.charAt(i) == str.charAt(len)) {
    //             len++;
    //             lps[i] = len;
    //             i++;
    //         } else{
    //             if (len != 0) {
    //                 len = lps[len - 1];
 
    //             } else{
    //                 lps[i] = len;
    //                 i++;
    //             }
    //         }
    //     }
    // }

    // public int strStr(String haystack, String needle) {
    //     int[] lps = new int[needle.length()];
    //     computeLPS(needle,lps);

    //     int i=0, j=0;
    //     while(i<haystack.length() && j<needle.length()){
    //         if(haystack.charAt(i) == needle.charAt(j)){
    //             i++;
    //             j++;
    //         } else{
    //             if(j == 0){
    //                 i++;
    //             } else{
    //                 j = lps[j-1];
    //             }
    //         }
    //     }

    //     if(j == needle.length()) return i-j;
    //     return -1;
    // }
}
