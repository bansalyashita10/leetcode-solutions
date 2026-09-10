class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        generate(n, 0, 0, "", result);

        return result;
    }

    public void generate(int n, int open, int close,
                         String current, List<String> result) {

        if(current.length() == 2 * n) {
            result.add(current);
            return;
        }

        // Choose '('
        if(open < n) {
            generate(n, open + 1, close,
                     current + "(", result);
        }

        // Choose ')'
        if(close < open) {
            generate(n, open, close + 1,
                     current + ")", result);
        }
    }
}