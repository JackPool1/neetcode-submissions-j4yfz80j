class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> valid = Map.of(
            ')', '(',
            '}', '{',
            ']', '['
        );



        Stack<Character> stack = new Stack<>();

        
        for(char c : s.toCharArray()){
            if(valid.containsKey(c)){
                if(!stack.isEmpty() && valid.get(c) == stack.peek()){
                    stack.pop();
                }else{
                    return false;
                }
            }else if(valid.containsValue(c)){
                stack.push(c);
            }

        }
            
            if(!stack.isEmpty()){
                return false;
            }

            return true;
    }
}
