class Solution {
    public int trap(int[] height) {

        if(height == null || height.length == 0) return 0;

        int l = 0;
        int r = height.length - 1;
        int res = 0;
        int maxL = height[l];
        int maxR = height[r];

        while(l < r){

            if(maxL < maxR){
                l++;
                maxL = Math.max(height[l], maxL);
                res += maxL - height[l];
                
            }
            else{
                r--;
                maxR = Math.max(maxR, height[r]);
                res += maxR - height[r];
            }
        }

        return res;
    }
}
