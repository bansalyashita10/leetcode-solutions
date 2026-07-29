import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequencies
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create frequency buckets
        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];

        // Step 3: Put each number in its frequency bucket
        for (int num : map.keySet()) {

            int frequency = map.get(num);

            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }

            bucket[frequency].add(num);
        }

        // Step 4: Take k elements from highest frequency
        int[] answer = new int[k];
        int index = 0;

        for (int frequency = nums.length;
             frequency >= 0 && index < k;
             frequency--) {

            if (bucket[frequency] != null) {

                for (int num : bucket[frequency]) {

                    answer[index] = num;
                    index++;

                    if (index == k) {
                        return answer;
                    }
                }
            }
        }

        return answer;
    }
}