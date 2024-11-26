interface Stack {
    void push(int item);
    int pop();
    boolean isEmpty();
    boolean isFull();
}

class FixedStack implements Stack {
    private int[] stackArray;
    private int top;

    public FixedStack(int size) {
        stackArray = new int[size];
        top = -1;
    }

    @Override
    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            stackArray[++top] = item;
        }
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;         }
        return stackArray[top--];
    }

   }

public class FixedStackDemo {
    public static void main(String[] args) {
        Stack stack = new FixedStack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);         
        System.out.println("Popped item: " + stack.pop()); 
        System.out.println("Popped item: " + stack.pop()); 
    }
}
