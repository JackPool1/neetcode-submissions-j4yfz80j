class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        int[][] pair = new int[n][2];

        for(int i = 0; i < n; i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }

        Comparator<int[]> comp = new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                return Integer.compare(b[0],a[0]);
            }
        };

        Arrays.sort(pair, comp);

        Stack<Double> fleets = new Stack<>();

        for(int[] p : pair){
            fleets.push((double) (target - p[0]) / p[1]);

            if(fleets.size() >= 2 && fleets.peek() <= fleets.get(fleets.size() - 2)){
                fleets.pop();
            }
        }

        return fleets.size();

    }
}
