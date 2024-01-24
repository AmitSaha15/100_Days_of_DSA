package Day36;

// https://leetcode.com/problems/long-pressed-name/

public class leetcodeQsn925 {
    public boolean isLongPressedName(String name, String typed) {
        int m = name.length();
        int n = typed.length();

        if(m > n) return false;
        if(name.charAt(0) != typed.charAt(0)) return false;

        int i = 0;
        int j = 0;
        while(j<n){
            if(i<m && name.charAt(i) == typed.charAt(j)){
                i++;
            }
            else if(j==0 || typed.charAt(j) != typed.charAt(j-1)){
                return false;
            }
            j++;
        }
        return (i==m && j==n);
    }
}
