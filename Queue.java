class CirQueue {
    private int[] Q;
    private int cap;
    private int front;
    private int rear;

    public CirQueue(int n) {
        cap = n;
        Q = new int[cap];
        front = -1;
        rear = -1;
    }

    public void push(int v) {
        // Queue is full
        if ((rear + 1) % cap == front) {
            System.out.println("QUEUE IS FULL");
            return;
        }

        // First element insertion
        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % cap;
        Q[rear] = v;
    }

    public int remove() {
        // Queue is empty
        if (front == -1) {
            return -999;
        }

        int removedValue = Q[front];

        // Only one element
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % cap;
        }

        return removedValue;
    }

    public void print() {
        if (front == -1) {
            System.out.println("QUEUE IS EMPTY");
            return;
        }

        System.out.print("Queue elements: ");
        int i = front;

        while (true) {
            System.out.print(Q[i] + " ");
            if (i == rear) {
                break;
            }
            i = (i + 1) % cap;
        }
        System.out.println();
    }
}

// Driver class
public class Queue {
    public static void main(String[] args) {
        CirQueue q = new CirQueue(5);

        q.push(10);
        q.push(20);
        q.push(30);
        q.print();

        q.remove();
        q.print();

        q.push(40);
        q.push(50);
        q.push(60); // may show full depending on capacity
        q.print();
    }
}