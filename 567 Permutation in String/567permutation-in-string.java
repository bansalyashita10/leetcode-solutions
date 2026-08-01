class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        // Count characters of s1
        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a']++;
        }
        // Create the first window of s2
        for (int i = 0; i < s1.length(); i++) {
            count2[s2.charAt(i) - 'a']++;
        }
        // Check the first window
        if (Arrays.equals(count1, count2)) {
            return true;
        }
        // Slide the window
        for (int right = s1.length(); right < s2.length(); right++) {
            // Add the new character
            count2[s2.charAt(right) - 'a']++;
            // Remove the old character
            count2[s2.charAt(right - s1.length()) - 'a']--;
            // Check whether frequencies are equal
            if (Arrays.equals(count1, count2)) {
                return true;
            }
        }
        return false;
    }
}