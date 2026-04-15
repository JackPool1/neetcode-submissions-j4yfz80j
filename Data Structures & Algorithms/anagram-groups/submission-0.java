class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(String word : strs){
            char wordArray[] = word.toCharArray();
            Arrays.sort(wordArray);
            String sortedWord = new String(wordArray);

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        result.addAll(map.values());
        return  result;

    }
}
