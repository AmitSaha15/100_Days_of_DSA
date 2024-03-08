package Day80;

// https://leetcode.com/problems/find-and-replace-in-string/

public class leetcodeQsn833 {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        int n = s.length();
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = String.valueOf(s.charAt(i));
        }

        for(int i=0; i<indices.length; i++){
            if(indices[i]+sources[i].length() <= n && s.substring(indices[i], indices[i]+sources[i].length()).equals(sources[i])){
                arr[indices[i]] = targets[i];

                for (int j=1; j<sources[i].length(); j++) { //replace the next char
                    arr[indices[i] + j] = "";
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i=0; i<arr.length; i++) {
            ans.append(arr[i]);
        }
        
        return ans.toString();
    }
}

// first let's create an array which consist all the chars of the given string
// then check the conditions
// use s.substring() instead of s.indexof() so that the search does not go beyond the length of sources[i]
// if the conditions satisfies arr[indices[i]] = targets[i]

