class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        

        for(String word : strs){
            int alphabet[] = new int[26];

            for(char c : word.toCharArray()){
                alphabet[c - 'a']++; //uses ascie to subtract and find its position
            }
        

        StringBuilder sb = new StringBuilder();

        for(int i : alphabet){
            sb.append(i).append('#');
        }
        String key = sb.toString();
        if (!map.containsKey(key)) {
        map.put(key, new ArrayList<>());
        }
        map.get(key).add(word);  

        }
         return new ArrayList<>(map.values());

    }
}
