class MinStack {
    Stack<Integer> stack;
    Stack<Integer> min=new Stack<>();
    public MinStack() {
      stack=new Stack<>();  
    }
    
    public void push(int val) {
        stack.push(val);
        if(min.isEmpty()){
            min.push(val);
        }
        else{
            if(val<=min.peek()){
                min.push(val);
            }
        }
    }
    
    public void pop() {
        int a=stack.pop();
        if(min.peek()==a){
            min.pop();
        }
    }
    
    public int top() {
        return(stack.peek());
    }
    
    public int getMin() {
        return(min.peek());
    }
}
