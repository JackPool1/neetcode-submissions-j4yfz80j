class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int res[] = new int[2];
        int i = 0;
        for(int num : nums){
            int missingNumber = target - num;
           if(map.containsKey(missingNumber)){
                System.out.println("entered");

                res[0] = map.get(missingNumber);
                res[1] = i;
            }else{
                map.put(num,i);
            }
            i++;
        }
        return res;
    }
}
