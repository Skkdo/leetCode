class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            }
            if(stack.isEmpty()) return false;

            char pop = stack.pop();
            if((pop == '(' && c == ')') || (pop == '{' && c == '}') || (pop == '[' && c == ']')) {
                continue;
            }
            return false;
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}