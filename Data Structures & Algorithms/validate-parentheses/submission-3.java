class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                if(!stack.isEmpty() && map.get(c) == stack.peek()){
                    stack.pop();
                }else{
                    return false;
                }
            }else if(map.containsValue(c)){
                stack.push(c);
            }
        }

        if(stack.isEmpty()){
        return true; 
        }
        else{
            return false;
        }
    }
}
