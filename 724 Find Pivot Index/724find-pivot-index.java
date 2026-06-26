class Solution {
    public int pivotIndex(int[] nums) {

        int lsum = 0;
        int totalsum = 0;

        for (int i = 0; i < nums.length; i++) {
            totalsum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int rsum = totalsum - lsum - nums[i];

            if (lsum == rsum)
                return i;

            lsum += nums[i];
        }

        return -1;
    }
}