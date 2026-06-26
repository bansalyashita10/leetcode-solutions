class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] answer=new int[nums.length];

        int lsum=0;
        int rsum=0;
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }

        for(int i=0;i<nums.length;i++){
            rsum=totalsum-nums[i]-lsum;
            answer[i] = Math.abs(lsum - rsum);
            lsum+=nums[i];
        }
        return answer;

    }
}