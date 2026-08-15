class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        String result = "";

        for (int j = words.length - 1; j >= 0; j--) {
            result += words[j];

            if (j != 0) {
                result += " ";
            }
        }

        return result;
    }
}