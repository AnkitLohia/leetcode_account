/*
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
 */
package leetcode_easy;

import java.util.Stack;

public class MinStack {
    /** initialize your data structure here. */
    Stack<Integer> stk;
    Stack<Integer> min;
    public MinStack() {
        stk = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int x) {
        stk.push(x);
        if(min.isEmpty()){
            min.push(x);
            return;
        }
        if(x <= min.peek())
            min.push(x);
    }
    
    public void pop() {
        if(stk.isEmpty())
            return;
        int x = stk.pop();
        if(min.peek() == x)
            min.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        if(min.isEmpty())
            return 0;
        return min.peek();
    }
} 
