class Solution {

    public String encode(List<String> strs) {
        StringBuilder combinedString = new StringBuilder();

        for(String word : strs){
            combinedString.append(word.length()).append('#').append(word);
        }

        return combinedString.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }

            int wordLength = Integer.parseInt(str.substring(i, j)); 
            j++;
            String word = str.substring(j, j + wordLength);
            result.add(word);
            i = j + wordLength;
        }
        return result;
    }
}
