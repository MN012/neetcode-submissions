class MyStack {
    Stack<Integer> obj = new Stack<>();
    public MyStack() {
    
    }
    
    public void push(int x) {
        obj.push(x);
    }
    
    public int pop() {
        return obj.pop();
    }
    
    public int top() {
        return obj.peek();
    }
    
    public boolean empty() {
        return obj.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */