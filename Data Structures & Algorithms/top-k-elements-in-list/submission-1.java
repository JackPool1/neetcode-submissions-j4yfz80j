class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap<>();

        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return freqMap.get(a) - freqMap.get(b);
            }
        });

        for(int num : freqMap.keySet()){
            heap.add(num);

            if(heap.size() > k){
                heap.poll();
            }
        }

        int res[] = new int[k];

        for(int i = 0; i < k; i++){
            res[i] = heap.poll();
        }
        return res;
    }
}
