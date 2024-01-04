package Day16;

// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/

public class leetcodeQsn1283 {
    public int smallestDivisor(int[] nums, int threshold) {
        int start = 0;
        int end = maxElement(nums);
        while(end>=start){
            int mid = (start+end)/2;
            int sum = sumAfterDivision(nums, mid);
            if(sum <= threshold){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return start;
    }
    int maxElement(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    int sumAfterDivision(int[] arr, int k){
        int sum = 0;
        for(int i=0; i<arr.length;i++){
            sum += Math.ceil((double)arr[i]/(double)k);
        }
        return sum;
    }
}
