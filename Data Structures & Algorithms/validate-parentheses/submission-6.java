class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> valid = Map.of(
            ')', '(',
            '}', '{',
            ']', '['
        );



        Stack<Character> stack = new Stack<>();

        
        for(char c : s.toCharArray()){
            if(!valid.containsKey(c)){
                stack.push(c);
            }else if(!stack.isEmpty() && stack.peek() == valid.get(c)){
                stack.pop();
            }else{
                return false;
            }

        }
            
            if(!stack.isEmpty()){
                return false;
            }

            return true;
    }
}
