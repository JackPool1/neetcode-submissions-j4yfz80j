class Solution {
    public int trap(int[] height) {
        int max = 0;
        int l = 0, r = height.length - 1;
        int maxL = height[l];
        int maxR = height[r];
        while(l < r){
            if(maxL <= maxR){
                l++;
                maxL = Math.max(maxL, height[l]);
                max += maxL - height[l];
            }
            else{
                r--;
                maxR = Math.max(maxR, height[r]);
                max += maxR - height[r];
                }
            }
            return max;
        }
       
    }

