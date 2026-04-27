class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int count = 1;

        if(s.length() <= 0){
            return 0;
        }
        for(int i = 0; i < s.length(); i++){
            int j = i + 1;
            Set<Character> seen = new HashSet<>();
            
            seen.add(s.charAt(i));
            while(j < s.length()){
                
                if(seen.contains(s.charAt(j))){
                    break;
                }
                seen.add(s.charAt(j));

                j++;
            }
            count = Math.max(count, seen.size());
        }

        return count;   
    }
}
