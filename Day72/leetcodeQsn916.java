package Day72;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/word-subsets/

public class leetcodeQsn916 {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        int[] target = new int[26]; //contain the count of chars in the resultant string
        
        for(String word : words2){
            int[] temp = new int[26]; //contain the count of all chars that are present in words2
            
            for(char ch : word.toCharArray()){
                temp[ch-'a']++;
                target[ch-'a'] = Math.max(target[ch-'a'],temp[ch-'a']); //the max count of 
                // the chars that are present in words2 will be put into target
            }
        }
        
        for(String w : words1){
            int[] arr = new int[26]; //contain the count of each char present in words1
            for(char ch : w.toCharArray()) arr[ch-'a']++;
            
            if(isSubset(arr,target)){
                ans.add(w);
            }
        }
        
        return ans;
    }

    public boolean isSubset(int[] source,int[] dest){
        for(int i=0;i<26;i++){
            if(dest[i]>source[i]) return false;
        }
        return true;
    }
}
