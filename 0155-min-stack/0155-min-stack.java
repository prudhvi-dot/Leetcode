class MinStack {

    ArrayList<Integer> stack;

    ArrayList<Integer> minStack;

    public MinStack() {
        this.stack = new ArrayList<>();
        this.minStack = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);

        if(minStack.isEmpty() || val<= minStack.get(minStack.size()-1)){
            minStack.add(val);
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) {
            return;
        }

        if(stack.get(stack.size()-1).equals(minStack.get(minStack.size()-1))) {
            minStack.remove(minStack.size()-1);
        }

        stack.remove(stack.size()-1);
    }
    
    public int top() {
        if(stack.isEmpty()) {
            return -1;
        }
        else {
            return stack.get(stack.size()-1);
        }
    }
    
    public int getMin() {
        if(minStack.isEmpty()) {
            return -1;
        }
        else {
            return minStack.get(minStack.size()-1);
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */