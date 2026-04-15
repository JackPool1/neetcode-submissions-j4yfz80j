class MinStack {
    private Deque<Integer> stack;
    public MinStack() { //intitializes stack object
        stack = new ArrayDeque<>();
    }
    
    public void push(int val) { //pushes element to top
        stack.push(val);
    }
    
    public void pop() { //delete top element
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i : stack){
            if(min > i){
                min = i;
            }
        }
        return min;
    }
}
