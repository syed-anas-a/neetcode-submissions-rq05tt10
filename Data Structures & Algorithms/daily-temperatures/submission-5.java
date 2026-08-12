class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> s = new Stack<>();
        for(int i = temperatures.length-1; i >= 0; i--) {
            if(s.isEmpty()) {
                s.push(i);
                res[i] = 0;
            }
            else if(!s.isEmpty() && temperatures[s.peek()] <= temperatures[i]) {
                int c = 0;
                while(!s.isEmpty() && temperatures[s.peek()] <= temperatures[i]) {
                    s.pop();
                    c++;
                }
                if(!s.isEmpty()) {
                    res[i] = s.peek()-i;
                }
                else {
                    res[i] = 0;
                }
                s.push(i);
            }
            else {
                res[i] = 1;
                s.push(i);
            }
        }
        return res;
    }
}
