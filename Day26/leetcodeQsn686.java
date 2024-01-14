package Day26;

// https://leetcode.com/problems/repeated-string-match/

// KMP algorithm

public class leetcodeQsn686 {
    void computeLPS(String str, int lps[]){
        int len = 0;
        int i = 1;
        lps[0] = 0;
 
        while (i < str.length()) {
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else{
                if (len != 0) {
                    len = lps[len - 1];
 
                } else{
                    lps[i] = len;
                    i++;
                }
            }
        }
    }

    boolean KMP(String str, String patt){
        int[] lps = new int[patt.length()];
        computeLPS(patt,lps);

        int i=0, j=0;
        while(i<str.length()){
            if(str.charAt(i) == patt.charAt(j)){
                i++;
                j++;
                if(j == patt.length()) return true;
            } else{
                if(j != 0){
                    j = lps[j-1];
                } else{
                    i++;
                }
            }
        }
        return false;
    }

    public int repeatedStringMatch(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();

        int repeat = (int)Math.ceil((double)len2/len1);
        String s = "";
        for(int i=0; i<repeat; i++) s += a;
        for(int i=0; i<3; i++){
            if(KMP(s,b)){
                return repeat+i;
            }
            s += a;
        }
        return -1;
    }
}
