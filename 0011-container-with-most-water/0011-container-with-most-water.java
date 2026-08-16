class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int max=0;
        int right=height.length-1;
        while(left<right){
            int waterHeight=Math.min(height[left],height[right]);
            int wide=right-left;
            int area=waterHeight*wide;
           max=Math.max(area,max);

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}