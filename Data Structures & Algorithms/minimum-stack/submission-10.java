class MinStack {
    Stack<Integer> main;
    Stack<Integer> min;

    public MinStack() {
        main = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        if(!min.isEmpty())
        {
            if(val <= min.peek()) {
                min.push(val);
            }
            else {
                min.push(min.peek());
            }
        } else { 
            min.push(val);
        }
        main.push(val);
    }
    
    public void pop() {
        if(main.isEmpty() || min.isEmpty()) return;
        main.pop();
        min.pop();
    }
    
    public int top() {
        if(!main.isEmpty()) return main.peek();
        return -1;
    }
    
    public int getMin() {
        if(!min.isEmpty()) return min.peek();
        return -1;
    }
}
