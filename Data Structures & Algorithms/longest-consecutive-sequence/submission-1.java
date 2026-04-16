class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(nums);

        
        int longest = 0;
        for(int i = 0; i < nums.length; i++){
            int consecCount = 1;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j - 1] == nums[j]) continue;

                if(nums[j - 1] == nums[j] - 1){
                    consecCount++;
                }else{
                    break;
                }
            }

            if(longest < consecCount){
                longest = consecCount;
            }
        }

        return longest;
}
}