class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();


        for(int num : nums){
            set.add(num);
        }

        int longest = 0;
        for(int i = 0; i < nums.length; i++){
            int count = 1;
            if(set.contains(nums[i] - 1)){
                
                int val = nums[i] - 1;
                while(set.contains(val)){
                    count++;
                    val--;
                }
            }

            if(longest < count){
                longest = count;
            }
        }
        return longest;
    }
}
