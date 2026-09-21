class FreqStack {
    Map <Integer, Integer> freq = new HashMap<>(); 
    Map<Integer, Stack<Integer>> group = new HashMap<>();
    int maxFrequency = 0;

    public FreqStack() {}
    
    public void push(int val) {
        freq.put(val, freq.getOrDefault(val, 0) + 1);
        int f = freq.get(val);
        maxFrequency = Math.max(maxFrequency, f);
        group.putIfAbsent(f, new Stack<>());
        group.get(f).push(val);
    }
    
    public int pop() {
    int val = group.get(maxFrequency).pop();
    freq.put(val, freq.get(val) - 1);
    if (group.get(maxFrequency).isEmpty()) maxFrequency--;
    return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */