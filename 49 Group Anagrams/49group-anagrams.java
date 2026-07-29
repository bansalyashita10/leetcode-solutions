class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            // Convert the word into a character array
            char[] characters = word.toCharArray();

            // Sort the characters
            Arrays.sort(characters);

            // Convert the sorted characters back to a String
            String key = new String(characters);

            // Add the original word to the correct group
            map.putIfAbsent(key, new ArrayList<>());

            map.get(key).add(word);
        }

        // Return all groups
        return new ArrayList<>(map.values());
    }
}