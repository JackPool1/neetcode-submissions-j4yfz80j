class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty()) return "";

        Map<Character, Integer> countT = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for(char c : t.toCharArray()){
            countT.put(c, countT.getOrDefault(c, 0)+ 1); //add the count of t chars 
        }

        int have = 0; //initialize the have which will count the macthes
        int need = countT.size(); //intitialize need will be the amont of matches needed
        int res[] = {-1,-1}; //intizlize res to store the r and l needed to obtain substring
        int l = 0; // left side of window which will move forward once you have gotten a correct
        //window
        int resLen = Integer.MAX_VALUE; //used to find out the smallest length and to store it into res

        for(int r = 0; r < s.length(); r++){ //loop from right to end
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1); //add the 

            if(countT.containsKey(c) && 
            window.get(c).equals(countT.get(c))){ // first checks if countT contains the char
                have++;                           // then it you find if the freq values equals each other 
            }                                     //if so add to have
            while(have == need){  
                if(r - l + 1 < resLen){ //while have == need check if window is the smallest
                    resLen = r - l + 1;
                    res[0] = l;
                    res[1] = r;
                }
            
            char leftChar = s.charAt(l); //then slide the left side of the window 
            window.put(leftChar, window.get(leftChar) - 1); //by putting and decrementing its freq
            if(countT.containsKey(leftChar) && window.get(leftChar) < countT.get(leftChar)){
                have--; //and checking if counT freq is greater than window freq then decrement have 
            } 
            l++; //increment left to keep checking if left character is valid or not
            } 
            

    }
    return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
}
}
