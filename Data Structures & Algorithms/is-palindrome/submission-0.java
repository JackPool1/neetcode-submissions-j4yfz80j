class Solution {
    public boolean isPalindrome(String s) {
        char[] sArr = s.toLowerCase().toCharArray();
        List<Character> listFront = new ArrayList<>();
        List<Character> listBack = new ArrayList<>();

        
        for (char c : sArr) {
            if (Character.isLetterOrDigit(c)) {
                listFront.add(c);
            }
        }

        
        for (int i = sArr.length - 1; i >= 0; i--) {
            if (Character.isLetterOrDigit(sArr[i])) {
                listBack.add(sArr[i]);
            }
        }

        return listFront.equals(listBack);
    }
}
