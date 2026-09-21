class MyQueue {
    Stack<Integer> obj1 = new Stack<>();
    Stack<Integer> obj2 = new Stack<>();

    public MyQueue() {}

    public void push(int x) {
        obj1.push(x);
    }

    public int pop() {
        if (obj2.isEmpty()) {
            while (!obj1.isEmpty()) {
                obj2.push(obj1.pop());
            }
        }
        return obj2.pop();
    }

    public int peek() {
        if (obj2.isEmpty()) {
            while (!obj1.isEmpty()) {
                obj2.push(obj1.pop());
            }
        }
        return obj2.peek();
    }

    public boolean empty() {
        return obj1.isEmpty() && obj2.isEmpty();
    }
}