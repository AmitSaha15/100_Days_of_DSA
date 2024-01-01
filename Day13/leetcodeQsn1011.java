package Day13;

// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

public class leetcodeQsn1011 {
    public int shipWithinDays(int[] weights, int days) {
        int start = maxElement(weights);
        int end = sum(weights);
        while(end>=start){
            int mid = (start+end)/2;
            int numOfDays = totalDays(weights, mid);
            if(numOfDays <= days){
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
    int sum(int[] arr){
        int s = 0;
        for(int i=0; i<arr.length; i++){
            s = s + arr[i];
        }
        return s;
    }
    int totalDays(int[] weights, int limit){
        int sum=0;
        int days=1;
        for(int i=0;i<weights.length;i++){   
            if(sum+weights[i]>limit){
                days+=1;
                sum=weights[i];
            } else{
                sum+=weights[i];
            }
        }
        return days;
    }
}
