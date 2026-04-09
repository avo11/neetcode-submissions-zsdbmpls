class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String word : strs){
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);

            if(!hm.containsKey(sorted)){
                hm.put(sorted, new ArrayList<>());
            }
            hm.get(sorted).add(word);
        }

        List<List<String>> result = new ArrayList<>();

        for(String key : hm.keySet()){
            result.add(hm.get(key));
        }
        return result;
    }
}
