class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < tokens.length; i++) {
            String ch = tokens[i];
            if(ch.matches("-?[0-9]+")) {
                st.push(Integer.parseInt(tokens[i]));
            }
            else {
                int a = st.pop();
                int b = st.pop();
                switch(ch) {
                    case "+":
                        int sum = a+b;
                        st.push(sum);
                        break;
                    case "-":
                        int diff = b-a;
                        st.push(diff);
                        break;
                    case "*":
                        int prod = a*b;
                        st.push(prod);
                        break;
                    case "/":
                        int quo = b/a;
                        st.push(quo);
                        break;
                    default:
                    break;
                }
                
            }
        }
        return st.pop();
    }
}
