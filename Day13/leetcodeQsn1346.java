package Day13;

import java.util.Arrays;

// https://leetcode.com/problems/check-if-n-and-its-double-exist/

public class leetcodeQsn1346 {
    public boolean checkIfExist(int[] arr) {
        // Brute force
        // int n = arr.length;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (i != j && arr[i] == 2 * arr[j]) {
        //             return true;
        //         }
        //     }
        // }
        // return false;

        // binary search
        Arrays.sort(arr);
        int n = arr.length;

        for(int i=0; i<n; i++){
            int target = 2*arr[i];
            int start = 0, end = n-1;
            while(end>=start){
                int mid = (start+end)/2;
                if(arr[mid] == target && mid != i){
                    return true;
                }
                if(arr[mid] < target){
                    start = mid+1;
                } else{
                    end = mid-1;
                }
            }
        }
        return false;
    }
}
