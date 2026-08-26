class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        generate(nums, 0, current, result);

        return result;
    }

    static void generate(int[] nums, int index,
                         List<Integer> current,
                         List<List<Integer>> result) {
        // Base case
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Choice 1: Take nums[index]
        current.add(nums[index]);
        generate(nums, index + 1, current, result);

        // Undo
        current.remove(current.size() - 1);

        // Choice 2: Don't take nums[index]
        generate(nums, index + 1, current, result);
    }
}