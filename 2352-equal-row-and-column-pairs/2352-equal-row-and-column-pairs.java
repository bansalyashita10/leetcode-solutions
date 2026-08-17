class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<List<Integer>, Integer> map = new HashMap<>();
        
        for (int i = 0; i < grid.length; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < grid.length; j++) {
                row.add(grid[i][j]);
            }
            map.put(row, map.getOrDefault(row, 0) + 1);
        }
        int count = 0;

        for (int j = 0; j < grid.length; j++) {
            List<Integer> column = new ArrayList<>();
            for (int i = 0; i < grid.length; i++) {
                column.add(grid[i][j]);
            }

            count += map.getOrDefault(column, 0);
        }
        return count;
    }
}