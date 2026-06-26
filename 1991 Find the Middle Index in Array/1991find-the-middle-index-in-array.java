class Solution {
    public int findMiddleIndex(int[] nums) {
        int lsum=0;
        int rsum=0;
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }

        for(int i=0;i<nums.length;i++){
            rsum=totalsum-nums[i]-lsum;
            if(lsum==rsum){
                return i;
            }
            lsum=lsum+nums[i];
        }
        return -1;
    }
}