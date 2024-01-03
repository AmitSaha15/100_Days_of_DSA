package Day15;

// https://leetcode.com/problems/median-of-two-sorted-arrays/

public class leetcodeQsn4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        if(n1>n2){
            return findMedianSortedArrays(nums2,nums1); // because we want to perform the binary search on the array that is shorter in length
        }
        int start = 0, end = n1;
        int elemLeft = (n1+n2+1) / 2;
        while(end >= start){
            int mid1 = (start+end) / 2;
            int mid2 = elemLeft - mid1;
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;
            if(mid1<n1) r1 = nums1[mid1];
            if(mid2<n2) r2 = nums2[mid2];
            if(mid1-1 >= 0) l1 = nums1[mid1-1];
            if(mid2-1 >=0) l2 = nums2[mid2-1];

            if(l1<=r2 && l2<=r1){
                if((n1+n2)%2 == 1) return Math.max(l1,l2);
                return (double)(Math.max(l1,l2)+Math.min(r1,r2)) / 2.0;
            }
            else if(l1>r2){
                end = mid1-1;
            } else{
                start = mid1+1;
            }
        }
        return 0;
    }
}
