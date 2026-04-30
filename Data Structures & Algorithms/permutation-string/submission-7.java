class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> s1Map = new HashMap<>();


        for(char c : s1.toCharArray()){
            s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);
        }


        int res = 0;
        int count = 0;
        for(int l = 0; l < s2.length(); l++){
            int r = l;
            Map<Character,Integer> mapToCompare = new HashMap<>();

            while(r < s2.length() && s1Map.containsKey(s2.charAt(r))){
                // if(mapToCompare.get(s2.charAt(r)) > s1Map.get(s2.charAt(r))){
                //     break;
                // }
                mapToCompare.put(s2.charAt(r), mapToCompare.getOrDefault(s2.charAt(r), 0) + 1);
                if(mapToCompare.get(s2.charAt(r)) > s1Map.get(s2.charAt(r))){
                    mapToCompare.put(s2.charAt(r), mapToCompare.getOrDefault(s2.charAt(r), 0 ) - 1);
                    break;
                }
                r++;
            }

            if(!mapToCompare.isEmpty() && s1Map.equals(mapToCompare)){
                return true;
            }
        }

        return false;


    }
}
