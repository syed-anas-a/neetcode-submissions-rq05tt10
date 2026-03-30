class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for(char ch: arr) {
            if(ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if(stack.isEmpty()) return false;
                if( 
                    ch == ')' && stack.pop() != '(' ||
                    ch == ']' && stack.pop() != '[' ||
                    ch == '}' && stack.pop() != '{') 
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
