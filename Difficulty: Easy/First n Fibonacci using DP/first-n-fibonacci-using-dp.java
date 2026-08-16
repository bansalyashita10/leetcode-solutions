class Solution {
    ArrayList<Integer> fibonacciNumbers(int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(0);
        if (n == 0) return ans;

        ans.add(1);

        for (int i = 2; i <= n; i++) {
            ans.add((ans.get(i - 1) + ans.get(i - 2)) % 1000000007);
        }

        return ans;
    }
}