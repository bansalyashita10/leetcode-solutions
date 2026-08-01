class Solution {
    public int characterReplacement(String s, int k) {

        int left = 0;
        int maxLength = 0;
        int maxFrequency = 0;

        int[] count = new int[26];

        for (int right = 0; right < s.length(); right++) {

            // Count the current character
            count[s.charAt(right) - 'A']++;

            // Find the highest frequency in the window
            maxFrequency = Math.max(
                maxFrequency,
                count[s.charAt(right) - 'A']
            );

            // If more than k replacements are needed,
            // shrink the window
            while ((right - left + 1) - maxFrequency > k) {

                count[s.charAt(left) - 'A']--;
                left++;
            }

            // Store the longest valid window
            maxLength = Math.max(
                maxLength,
                right - left + 1
            );
        }

        return maxLength;
    }
}