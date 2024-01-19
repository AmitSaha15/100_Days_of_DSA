package Day31;

// https://leetcode.com/problems/permutation-in-string/

public class leetcodeQsn567 {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        if(m > n) return false;

        int[] freq = new int[26]; 
        
        // freq of chars in s1.... for same chars in s2 freq getting sub by 1
        for(int i=0; i<m; i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }

        for(int i=0; i<n-m; i++){
            if(isAllZero(freq)) return true; //if all the elems in freq is zero then s1 is one of s2's substring
            freq[s2.charAt(i)-'a']++;
            freq[s2.charAt(i+m)-'a']--;
        }
        return isAllZero(freq);
    }

    boolean isAllZero(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0) return false;
        }
        return true;
    }
}
