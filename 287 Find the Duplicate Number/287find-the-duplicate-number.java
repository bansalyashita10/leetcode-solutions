class Solution {
    public int findDuplicate(int[] nums) {

        // Find a meeting point inside the cycle
        int slow = nums[0];
        int fast = nums[0];

        do {
            // Move slow by 1 step
            slow = nums[slow];

            // Move fast by 2 steps
            fast = nums[nums[fast]];

        } while (slow != fast);


        // Phase 2:
        // Find the entrance of the cycle

        slow = nums[0];

        while (slow != fast) {

            // Both move one step
            slow = nums[slow];
            fast = nums[fast];
        }

        // Cycle entrance = duplicate number
        return slow;
    }
}