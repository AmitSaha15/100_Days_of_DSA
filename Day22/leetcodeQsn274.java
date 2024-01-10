package Day22;

import java.util.Arrays;

// https://leetcode.com/problems/h-index/

public class leetcodeQsn274 {
    public int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);

        if(n==0) return 0;
        if(citations[0] >= n) return n;

        int low = 0;
        int high = n-1;
        int index=0;
        while(high >= low){
            int mid = low+(high-low)/2;
            if(citations[mid] >= n-mid){
                index = n-mid;
                high = mid-1;
            } else{
                low = mid+1;
            }
        }
        return index;
    }
}
