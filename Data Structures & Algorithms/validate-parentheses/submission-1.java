class Solution {
    public boolean isValid(String s) {
       Deque<Character> stack = new ArrayDeque<>();
       HashMap<Character,Character> matching = new HashMap<>();
       matching.put(')', '(');
       matching.put('}','{');
       matching.put(']','[');

       int index = s.length() / 2; // need to -1 everytime i pop the 2 parathensis

       for(char c : s.toCharArray()){
        if(matching.containsKey(c)){
        if(!stack.isEmpty() && matching.get(c) == stack.peek()){
            stack.pop();
        }else{
            return false;
        }
        }else{
            stack.push(c);
        }
       }
       
    
        return stack.isEmpty();
    }
}
