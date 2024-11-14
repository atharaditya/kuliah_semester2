package Jobsheet3Stack;

class StackX {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public StackX(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long j) {
        stackArray[++top] = j;
    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize-1);
    }

    public void delete(int index) {
        if (index < 0 || index > top) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        
        for (int i = index; i < top; i++) {
            stackArray[i] = stackArray[i+1];
        }
        
        top--;
    }

    public int search(long value) {
        for (int i = top; i >= 0; i--) {
            if (stackArray[i] == value) {
                return top - i;
            }
        }
        return -1; 
    }

    public void edit(int index, long newValue) {
        if (index < 0 || index > top) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        stackArray[index] = newValue;
    }

    public long getTotal() {
        long total = 0;
        for (int i = top; i >= 0; i--) {
            total += stackArray[i];
        }
        return total;
    }

    public double getAverage() {
        if (isEmpty()) {
            return 0;
        }
        long total = getTotal();
        return (double) total / (top + 1);
    }

     public long getMaximum() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        long max = stackArray[0];
        for (int i = 1; i <= top; i++) {
            if (stackArray[i] > max) {
                max = stackArray[i];
            }
        }
        return max;
    }

     public long getMinimum() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        long min = stackArray[0];
        for (int i = 1; i <= top; i++) {
            if (stackArray[i] < min) {
                min = stackArray[i];
            }
        }
        return min;
    }
}

class StackApp {
    public static void main(String[] args) {
        StackX theStack = new StackX(10);
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        theStack.delete(2);

        int index = theStack.search(80);
        if (index != -1) {
            System.out.println("Elemen ditemukan pada indeks ke-" + index);
        } else {
            System.out.println("Elemen tidak ditemukan dalam stack");
        }

        theStack.edit(2, 10);

        long total = theStack.getTotal();
        double average = theStack.getAverage();
        long maximum = theStack.getMaximum();
        long minimum = theStack.getMinimum();
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);

        while ( !theStack.isEmpty() ) {
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
    }
}