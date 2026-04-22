class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //return the indices 
        // index1 < index2 
        // index1 + index2 = target
        
        //0 0 0 0

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                int index1 = numbers[i];
                int index2 = numbers[j];
                int sum = index1 + index2;

                if(sum == target){
                    return new int[] {i + 1, j + 1};
                }
                
            }
        }

        return new int[] {0,0};
    }
}
