class Solution {
    public int[] twoSum(int[] nums, int target) {
        int compliment = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        // for(int num : nums){
        //     int i = 0;
        //     map.put(num, i);
        //     i++;
        // }   
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            compliment = target - nums[i];

            if(map.containsKey(compliment)){
                return new int[] {map.get(compliment),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};

    }
}
