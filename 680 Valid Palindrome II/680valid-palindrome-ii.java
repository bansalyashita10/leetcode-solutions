class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            // Characters match
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            }
            // Characters do not match
            else {
                // Try deleting the left character
                // OR try deleting the right character
                return isPalindrome(s, left + 1, right)
                    || isPalindrome(s, left, right - 1);
            }
        }
        return true;
    }
    public boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}