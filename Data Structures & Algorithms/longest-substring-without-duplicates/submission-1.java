class Solution {
    public int lengthOfLongestSubstring(String s) {
                int longest = 0;

        for(int i = 0; i < s.length(); i++){   // go through each character
            int j = i + 1;
            Set<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            int count = 1;                     // start count at 1 because we added one character

            while(j < s.length() && set.add(s.charAt(j))){  // check bounds first
                count++;
                j++;
            }

            longest = Math.max(longest, count);
            // no need to skip i by count; just let for loop increment normally
        }

        return longest;
    }
}


