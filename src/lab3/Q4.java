package lab3;

class StackUnderflowException extends IllegalStateException {
    public StackUnderflowException() { }

    public StackUnderflowException(String s) { super(s); }

    public StackUnderflowException(String message, Throwable cause) { super(message, cause); }

    public StackUnderflowException(Throwable cause) { super(cause); }
}

class StackOverflowException extends IllegalStateException {
    public StackOverflowException() { }

    public StackOverflowException(String s) { super(s); }

    public StackOverflowException(String message, Throwable cause) { super(message, cause); }

    public StackOverflowException(Throwable cause) { super(cause); }
}

class Stack {
    private final int[] data;
    public int top;

    public Stack(int length) {
        data = new int[length];
        top = -1;
    }

    public void push(int item) throws StackOverflowException {
        if (top == data.length - 1) { throw new StackOverflowException("Cannot push to a full stack."); }

        data[++top] = item;
    }

    public int pop() throws StackUnderflowException {
        if (top == 0) { throw new StackUnderflowException("Cannot pop from an empty stack."); }

        return data[top--];
    }

    public int peek() throws StackUnderflowException {
        if (top == -1) { throw new StackUnderflowException("Cannot peek an empty stack."); }
        return data[top];
    }
}

/**
 * Create a class called Stack for storing integers. The instance variables are:<p> - An integer array.<p> - An integer
 * for storing the top of stack.
 */
public class Q4 { }
