class Solution {
    public boolean isPalindrome(String s) {
        
        int left = 0;
        int right = s.length() - 1;
        
        while(left < right){
            char cL = s.charAt(left);
            char cR = s.charAt(right);

            if(!Character.isLetterOrDigit(cL)){
                left++;
                 continue;
            }
            if(!Character.isLetterOrDigit(cR)){
                right--;
                 continue;
            }
            if (Character.toLowerCase(cL) != Character.toLowerCase(cR)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
