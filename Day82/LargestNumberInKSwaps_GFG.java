package Day82;

// https://www.geeksforgeeks.org/problems/largest-number-in-k-swaps-1587115620/1

public class LargestNumberInKSwaps_GFG {
    static String maxNum;
    public static String findMaximumNum(String str, int k){
        //code here.
        maxNum = str;
        solve(str.toCharArray(), k);
        return maxNum;
    }
    
    public static void solve(char[] arr, int k){
        if(k == 0) return;
        
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){ // if digit at position i is less than digit at position j, swap it
            // and check for maximum number so far and recurse for remaining swaps
                if(arr[i] < arr[j]){
                    // swap arr[i] with arr[j]
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    
                    solve(arr, k-1);
                    if (String.valueOf(arr).compareTo(maxNum) > 0){ //check if current num is more than maximum so far
                        maxNum = String.valueOf(arr);
                    }
                    // backtrack
                    char ch = arr[i];
                    arr[i] = arr[j];
                    arr[j] = ch;
                }
            }
        }
    }
}
