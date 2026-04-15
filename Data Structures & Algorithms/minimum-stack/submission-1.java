class MinStack {
    private Deque<Integer> stack;
    private Deque<Integer> minStack;
    public MinStack() { //intitializes stack object
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }
    
    public void push(int val) { //pushes element to top
        stack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
        
    }
    
    public void pop() { //delete top element
        if(stack.isEmpty()) return;

        int top = stack.pop();

        if(top == minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
