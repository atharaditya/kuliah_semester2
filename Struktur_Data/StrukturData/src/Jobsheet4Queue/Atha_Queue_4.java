package Jobsheet4Queue;

class Queue {
    private int maxSize;
    private long[] queArray;
    private int head;
    private int tail;
    private int nItems;

    public Queue(int s) {
        maxSize = s;
        queArray = new long[maxSize];
        head = 0;
        tail = -1;
        nItems = 0;
    }

    public void enqueue(long j) {
        queArray[++tail] = j;
        nItems++;
    }
    
    public long dequeue() {
        long temp = queArray[head++];
        nItems--;
        return temp;
    }

    public long peekhead() {
        return queArray[head];
    }

    public boolean isEmpty() {
        return (nItems==0);
    }

    public boolean isFull() {
        return (nItems==maxSize);
    }

    public int size() {
        return nItems;
    }

    public void remove(int index) {
        if (index < 0 || index >= nItems) {
            System.out.println(" ");
            return;
        }

        for (int i = index; i < nItems - 1; i++) {
            queArray[i] = queArray[i + 1];
        }

        tail--;
        nItems--;
    }
    
    public int find(long value) {
        for (int i = 0; i < nItems; i++) {
            if (queArray[i] == value) {
                return i;
            }
        }
        return -1;
    }
}

class Atha_Queue_4 {
    public static void main(String[] args) {
        Queue theQueue = new Queue(10);

        theQueue.enqueue(10);
        theQueue.enqueue(20);
        theQueue.enqueue(30);
        theQueue.enqueue(40);

        // theQueue.dequeue();
        // theQueue.dequeue();
        // theQueue.dequeue();

        theQueue.enqueue(50);
        theQueue.enqueue(60);
        theQueue.enqueue(70);
        theQueue.enqueue(80);
        theQueue.enqueue(90);

        // theQueue.remove(2);

         int index = theQueue.find(70); 

         if (index != -1) {
             System.out.println("Elemen 70 ditemukan pada index: " + index);
         } else {
             System.out.println("Element 70 tidak ditemukan.");
         }

        while( !theQueue.isEmpty() )
            {
                long n = theQueue.dequeue();
                System.out.print(n);
                System.out.println(" ");
            }
        System.out.println(" ");
    }
}