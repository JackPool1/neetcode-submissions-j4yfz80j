class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();

        for(String word : strs){
            char wordArr[] = word.toCharArray();
            Arrays.sort(wordArr);
            String sortedWord = new String(wordArr);

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }

        res.addAll(map.values());
        return res;
    }
}
