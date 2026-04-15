class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> count = new HashMap<>();
        int maxLen = 0;

        int l = 0;

        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);

            while(count.containsKey(c)){
                char leftC = s.charAt(l);
                count.remove(leftC);
                l++;
               // maxLen = Math.max(r - l + 1, maxLen);
            }
            maxLen = Math.max(r - l + 1, maxLen);

            count.put(c, count.getOrDefault(c, 0) + 1);
             

        }
        return maxLen;
    }
}
