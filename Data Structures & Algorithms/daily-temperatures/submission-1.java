class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // brute force soln.
        int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int i = 1;
        while(i < temperatures.length) {
            if(temperatures[i] > temperatures[stack.peek()]) {
                while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                    res[stack.peek()] = i - stack.pop();
                }
            }
            stack.push(i);
            i++;
        }
        return res;
    }
}
