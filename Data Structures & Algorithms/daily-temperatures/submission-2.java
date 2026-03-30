class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        int i = 1;
        while(i < temperatures.length) {
            int curr = temperatures[i];
            if(temperatures[stack.peek()] < curr) {
                while(!stack.isEmpty() && temperatures[stack.peek()] < curr) {
                    res[stack.peek()] = i - stack.pop();
                }
            }
            stack.push(i);
            i++;
        }
        return res;
    }
}