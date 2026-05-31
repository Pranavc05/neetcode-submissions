class MinStack {
    
    Stack<Integer> minstack;
    Stack<Integer> normstack;
    
    public MinStack() {
        this.minstack = new Stack<>();
        this.normstack = new Stack<>();
    }
    
    public void push(int val) {
        normstack.push(val);
        if(!this.minstack.empty()){
            val = Math.min(val, this.minstack.peek());
        } else{
            Math.min(val, val);
        }
        this.minstack.push(val);
    }
    
    public void pop() {
        this.normstack.pop();
        this.minstack.pop();
    }
    
    public int top() {
        return this.normstack.peek();
    }
    
    public int getMin() {
        return this.minstack.peek();   
    }
}
