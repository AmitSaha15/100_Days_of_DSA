package Day88;

// https://leetcode.com/problems/max-chunks-to-make-sorted/

public class leetcodeQsn769 {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int currMax = arr[0];
        int count = 0;
        
        for(int i=0; i<n; i++) {
            currMax = Math.max(currMax, arr[i]);
            if(currMax == i){ //upper limit of partition i.e. unsorted region
                count++; //count of partition that has to be sorted
            }
        }
        return count;
    }
}
