class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> letterCount1 = new HashMap<>();
        HashMap<Character,Integer> letterCount2 = new HashMap<>();


        for(char c : s.toCharArray()){
            if(letterCount1.containsKey(c)){
            letterCount1.put(c, letterCount1.get(c) + 1);
        }else{
            letterCount1.put(c, 1);
        }
        }


        for(char c : t.toCharArray()){
            if(letterCount2.containsKey(c)){
                letterCount2.put(c, letterCount2.get(c) + 1);   
            }else{
                letterCount2.put(c,1);
            }
        }


        if(letterCount1.equals(letterCount2)){
            return true;
        }

        return false;


        
    }
}
