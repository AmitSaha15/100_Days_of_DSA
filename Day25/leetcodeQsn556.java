package Day25;

// https://leetcode.com/problems/next-greater-element-iii/

public class leetcodeQsn556 {
    void swap(char[] arr, int first, int second){
        char temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public int nextGreaterElement(int c) {
        char[] arr = (""+c).toCharArray();
        int n = arr.length;
        int p1 = n-2;
        while(p1>=0 && arr[p1] >= arr[p1+1]) p1--;
        if(p1 == -1) return -1; // no such integer found

        int p2 = n-1;
        while(arr[p2]<=arr[p1]) p2--;

        swap(arr,p1,p2);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<=p1; i++){
            sb.append(arr[i]);
        }
        for(int i=n-1; i>p1; i--){
            sb.append(arr[i]);
        }

        long ans = Long.parseLong(sb.toString());
        return ans>Integer.MAX_VALUE ? -1 : (int)ans;
    }
}
