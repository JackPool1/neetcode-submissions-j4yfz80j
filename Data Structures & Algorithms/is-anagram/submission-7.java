class Solution {
    public boolean isAnagram(String s, String t) {
        //HashMap<Character,Integer> map = new HashMap<>();

        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();

        Arrays.sort(sArray);
        // sArray.sort();
        // tArray.sort();
        Arrays.sort(tArray);


        if(Arrays.equals(sArray,tArray)){
            return true;
        }
        return false;
    }
}
