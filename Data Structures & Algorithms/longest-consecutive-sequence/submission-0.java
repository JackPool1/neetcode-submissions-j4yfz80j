class Solution {
    public int longestConsecutive(int[] nums) {
        //Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }
        int longest = 0;
        for(int num : nums){
            if(!set.contains(num - 1)){
                int count = 1;
                int currentNum = num + 1;

                while(set.contains(currentNum)){
                    count++;
                    currentNum++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;

    }
}
