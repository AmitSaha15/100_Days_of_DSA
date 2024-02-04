package Day47;

// https://leetcode.com/problems/h-index-ii/

public class leetcodeQsn275 {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int start = 0;
        int end = n-1;

        while(end >= start){
            int mid = start + (end-start) / 2;
            //we find the answer where the (n-mid) means number of papers has at least 
            // citations[mid] citations

            if(citations[mid] == n-mid) return (n-mid);
            //when the citations in (n-mid) is more so to reduce it we have to increase 
            // mid so move right i.e start=mid+1

            else if(citations[mid] < n-mid){ 
                start = mid+1;
            } else{ //when the citations in (n-mid) is less so to increase it we must 
            // reduce mid so move left i.e end=mid-1
                end = mid-1;
            }
        }
        return (n-start);
    }
}
