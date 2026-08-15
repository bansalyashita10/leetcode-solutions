class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        ArrayList<Boolean> list = new ArrayList<>();

        int maximum = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > maximum) {
                maximum = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= maximum) {
                list.add(true);
            } else {
                list.add(false);
            }
        }

        return list;
    }
}