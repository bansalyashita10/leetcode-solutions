class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();
        String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        generate(digits, 0, "", result, map);

        return result;
    }

    public void generate(String digits, int index, String current,
                         List<String> result, String[] map) {

        // Base case
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        // Get letters corresponding to current digit
        String letters = map[digits.charAt(index) - '0'];

        // Try every possible letter
        for (char ch : letters.toCharArray()) {
            generate(digits,index + 1,current + ch,result, map);
        }
    
    }
}