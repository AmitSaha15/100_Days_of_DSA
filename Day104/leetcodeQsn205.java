package Day104;

import java.util.Arrays;

// https://leetcode.com/problems/isomorphic-strings/

public class leetcodeQsn205 {
    public boolean isIsomorphic(String s, String t) {
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        Arrays.fill(map1, -1);
        Arrays.fill(map2, -1);
        
        for (int i=0; i<s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            
            if ((map1[ch1] != -1 && map1[ch1] != ch2) || (map2[ch2] != -1 && map2[ch2] != ch1))
                return false;
            
            map1[ch1] = ch2;
            map2[ch2] = ch1;
        }
        
        return true;


        // Map<Character, Character> map1 = new HashMap<>();
        // Map<Character, Character> map2 = new HashMap<>();
        
        
        // for(int i=0; i<s.length(); i++) {
            
        //     char ch1 = s.charAt(i);
        //     char ch2 = t.charAt(i);
            
        //     if((map1.containsKey(ch1) && map1.get(ch1) != ch2) || (map2.containsKey(ch2) && map2.get(ch2) != ch1)) {
        //         return false;
        //     }
            
        //     map1.put(ch1, ch2);
        //     map2.put(ch2, ch1);
        // }
        
        // return true;
    }
}
