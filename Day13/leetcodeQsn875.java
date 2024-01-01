package Day13;

// https://leetcode.com/problems/koko-eating-bananas/

public class leetcodeQsn875 {
    int maxElement(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    int totalTime(int[] arr, int k){
        int totalHours = 0;
        for(int i=0; i<arr.length;i++){
            totalHours += Math.ceil((double)arr[i]/(double)k);
        }
        return totalHours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int start = 0;
        int end = maxElement(piles);
        while(end>=start){
            int mid = (start+end)/2;
            int time = totalTime(piles, mid);
            if(time <= h){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return start;
    }
}
