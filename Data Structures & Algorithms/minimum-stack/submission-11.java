class MinStack {

    Stack<Integer> main;
    Stack<Integer> min;

    public MinStack() {
        this.main = new Stack<Integer>();
        this.min = new Stack<Integer>();
    }
    
    public void push(int val) {
        main.push(val);
        if(min.isEmpty()) min.push(val);
        else {
            int x = Math.min(val, min.peek());
            min.push(x);
        }
    }
    
    public void pop() {
        if(!main.isEmpty()) {
            main.pop();
            min.pop();
        }
    }
    
    public int top() {
        return main.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
