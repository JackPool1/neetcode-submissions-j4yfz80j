class Solution {
    public int[] dailyTemperatures(int[] temp) {
        //Stack<Integer> temperatures = new Stack<>();
        int[] res = new int[temp.length];

        for(int i = 0; i < temp.length; i++){
            for(int j = i + 1; j < temp.length; j++){
                if(temp[j] > temp[i]){
                    res[i] = j - i;
                    break;
                }
            }
        }


        return res;
    }
}
