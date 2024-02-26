package Day69;

import java.util.Arrays;

// https://leetcode.com/problems/letter-tile-possibilities/

public class leetcodeQsn1079 {
    public int numTilePossibilities(String tiles) {
        char[] arr = tiles.toCharArray();
        Arrays.sort(arr);

        boolean[] visited = new boolean[tiles.length()];
        
        return helper(arr, visited);
    }
    
    private int helper(char[] arr, boolean[] visited){
        int count = 0;
        
        for(int i=0; i<arr.length; i++){
            if(i>0 && arr[i] == arr[i-1] && !visited[i-1]) continue;
            
            if(!visited[i]){
                visited[i] = true;
                count++;
                count += helper(arr, visited);
                visited[i] = false;
            }
        }
        
        return count;
    }
}
