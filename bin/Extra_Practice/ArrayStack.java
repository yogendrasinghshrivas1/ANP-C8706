public class ArrayStack {

    private int[] array;
    private int top;
    private int capacity;

    public ArrayStack(int capacity) {
        array = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        // TODO: implement push operation
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        array[++top] = element;

    }

    public int pop() {
        // TODO: implement pop operation
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return array[top--];

    }

    public int peek() {
        // TODO: implement peek operation
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return array[top];

    }

    public boolean isEmpty() {
        // TODO: implement isEmpty operation
        return top == -1;

    }

    public int size() {
        // TODO: implement size operation
        return top + 1;
    }

    public static void main(String[] args) {
        ArrayStack sc = new ArrayStack(5);

        sc.push(10);
        sc.push(20);
        sc.push(30);

        System.out.println("Top element is: " + sc.peek());
        System.out.println("Stack size is: " + sc.size());

        sc.pop();
        sc.pop();

        System.out.println("Top element is: " + sc.peek());
        System.out.println("Stack size is: " + sc.size());

        sc.pop();

        System.out.println("Stack is empty: " + sc.isEmpty());


    }


}
