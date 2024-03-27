package Day99;

// https://leetcode.com/problems/decode-xored-array/

public class leetcodeQsn1720 {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] arr = new int[n+1];

        arr[0] = first;
        for(int i=0; i<n; i++){
            arr[i+1] = encoded[i] ^ arr[i];
        }

        return arr;
    }
}
