import java.util.HashSet;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> windowNums = new HashSet<>();
        int start = 0;
        int end = 0;
        while (end < nums.length) {
            if (!windowNums.add(nums[end])) {          
                return true;
            }
            if (end - start == k) {
                windowNums.remove(nums[start]);
                start++;
            }
            end++;   // move end every time
        }
        return false;
    }
}