class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freqCount = new HashMap<>();

        for(int num : nums){
            
            freqCount.put(num, freqCount.getOrDefault(num,0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return freqCount.get(a) - freqCount.get(b);
            }
        });

        int res[] = new int[k];

        for(int num : freqCount.keySet()){
            heap.add(num);


            if(heap.size() > k){
                heap.poll();
            }
        }

        for (int i = 0; i < k; i++) {
            res[i] = heap.poll();
        }
        return res;
    }
}