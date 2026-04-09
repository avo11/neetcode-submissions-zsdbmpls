class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> hashmap = new HashMap<>();

        for(String word : strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            hashmap.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(hashmap.values());
    }
}
