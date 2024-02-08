package Day51;

// https://leetcode.com/problems/container-with-most-water/

public class leetcodeQsn11 {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int area = 0;

        while(right > left){
            if(height[left] < height[right]){
                area = Math.max(area, height[left] * (right-left));
                left++;
            } else{
                area = Math.max(area, height[right] * (right-left));
                right--;
            }


            // int width = right-left;
            // int area = width * Math.min(height[left], height[right]);
            // ans = Math.max(ans, area);

            // if(height[left] < height[right]) left++;
            // else right--;
        }
        return area;
    }
}
