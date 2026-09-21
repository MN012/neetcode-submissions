class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> result = new Stack<>();

        for (String token : tokens) {
            if (!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")) {
                result.push(Integer.parseInt(token));
            } else if (token.equals("+")) {
                int top = result.pop();
                int second = result.pop();
                result.push(second + top);
            } else if (token.equals("-")) {
                int top = result.pop();
                int second = result.pop();
                result.push(second - top);
            } else if (token.equals("*")) {
                int top = result.pop();
                int second = result.pop();
                result.push(second * top);
            } else {
                int top = result.pop();
                int second = result.pop();
                result.push(second / top);
            }
        }
        return result.pop();
    }
}