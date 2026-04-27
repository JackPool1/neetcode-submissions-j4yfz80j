class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int count = 1;

        if(s.length() <= 0){
            return 0;
        }
        
    
        for(int i = 0; i < s.length(); i++){
            int j = i + 1;
            HashMap<Character, Integer> seen = new HashMap<>();
            seen.put(s.charAt(i), i);

            while(j < s.length()){

                if(seen.containsKey(s.charAt(j))){
                    i = seen.get(s.charAt(j));
                    seen.put(s.charAt(j), j);
                    break;
                }
                seen.put(s.charAt(j), j);
                j++;
            }
            count = Math.max(count, seen.size());
        }

        return count;   


    }
}
