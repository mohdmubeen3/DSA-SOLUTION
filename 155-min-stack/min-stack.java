import java.util.Stack;

class MinStack {
    private Stack<Long> stack;
    private long min;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        long x = val;

        if (stack.isEmpty()) {
            stack.push(x);
            min = x;
        } else {
            if (x >= min) {
                stack.push(x);         
            } else {
                stack.push(2*x - min);  
                min = x;                
            }
        }
    }
    
    public void pop() {
        if (stack.isEmpty()) return;

        long x = stack.pop();

        if (x < min) {  
            min = 2*min - x;
        }
    }
    
    public int top() {
        if (stack.isEmpty()) return -1;

        long x = stack.peek();

        if (x >= min) return (int)x;    
        else return (int)min;           
    }
    
    public int getMin() {
        return (int)min;
    }
}