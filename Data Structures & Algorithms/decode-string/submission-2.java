class Solution {
    public String decodeString(String s) {
        Stack<String> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        String current = "";
        int k = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0');
            } else if (c == '[') {
                strStack.push(current);
                numStack.push(k);
                current = "";
                k = 0;
            } else if (c == ']') {
                int times = numStack.pop();
                String prev = strStack.pop();
                current = prev + current.repeat(times);
            } else {
                current += c;  
            }
        }
    return current;
    }
}