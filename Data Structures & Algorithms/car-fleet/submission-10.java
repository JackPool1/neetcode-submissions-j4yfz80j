class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
       int[][] pair = new int[position.length][2];


        for(int i = 0; i < position.length; i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }

        Comparator<int[]> comp = new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                return Integer.compare(b[0],a[0]);
            }
        };

        Arrays.sort(pair,comp);

        Stack<Double> stack = new Stack<>();


        for(int[] p : pair){
            stack.push((double) (target - p[0]) / p[1]);

            if(stack.size() >= 2 && stack.peek() <= stack.get(stack.size() - 2)){
                stack.pop();
            }
        }

        return stack.size();





    }
}
