class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> tCount = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();

        if(s.length() < t.length()) return "";

        for(int i = 0; i < t.length(); i++){
            tCount.put(t.charAt(i),tCount.getOrDefault(t.charAt(i), 0 ) +1);
        }
        int res[] = {-1,-1};
        int l = 0;
        int have = 0, need = tCount.size();
        int resLen = Integer.MAX_VALUE;

        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if(tCount.containsKey(c) && tCount.get(c) == window.get(c)){
                have++;
            }

            while(have == need){
                if(resLen > r - l + 1){
                    resLen = r - l + 1;
                    res[0] = l;
                    res[1] = r;
                }
               
                window.put(s.charAt(l), window.get(s.charAt(l)) - 1);
                if(tCount.containsKey(s.charAt(l)) && window.get(s.charAt(l)) < tCount.get(s.charAt(l))){
                    have--;
                }
                l++;
                
            }

        }
        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}
