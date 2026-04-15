public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] output = new int[n - k + 1];
        Deque<Integer> q = new LinkedList<>();
        int l = 0, r = 0;

        while (r < n) {
            while (!q.isEmpty() && nums[q.getLast()] < nums[r]){ //9 - 12 gets rid of  
                q.removeLast();                                  //of the tail of the deque
            }                                                    //if its smaller than nums[r]
            q.addLast(r);                                        //bc there will be no way nums[q.getLast()]
                                                                 //will be the greatest element
            if (l > q.getFirst()) { 
                q.removeFirst(); //14-16 removes the elements out of the window
            }

            if ((r + 1) >= k) {
                output[l] = nums[q.getFirst()]; //record the answer once the dequeu reaches its max window size
                l++;
            }
            r++;
        }

        return output;
    }
}