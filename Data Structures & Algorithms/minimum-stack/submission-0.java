class MinStack {
     
     private Stack<Integer> mainStack;
     private Stack<Integer> antStack; 
    public MinStack() {
        mainStack = new Stack<>();
        antStack = new Stack<>();
    }
    
    public void push(int val) {
        mainStack.push(val);

        if(antStack.isEmpty() || val <= antStack.peek()){
            antStack.push(val);

        }
    }
    
    public void pop() {
        int topVal = mainStack.pop();
        if(topVal == antStack.peek()){
            antStack.pop();
        }
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return antStack.peek();
    }
}
