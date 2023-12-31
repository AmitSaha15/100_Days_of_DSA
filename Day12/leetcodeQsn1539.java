package Day12;

// https://leetcode.com/problems/kth-missing-positive-number/

public class leetcodeQsn1539 {
    public int findKthPositive(int[] arr, int k) {
        // Brute force -->
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] <= k){
        //         k++;
        //     } else{
        //         break;
        //     }
        // }
        // return k;

        // binary search
        int first = 0;
        int last = arr.length-1;

        while(last >= first){
            int mid = (first+last)/2;
            int missingNum = arr[mid] - (mid+1);
            if(missingNum >= k){
                last = mid-1;
            } else{
                first = mid+1;
            }
        }

        return last+k+1;
    }
}
