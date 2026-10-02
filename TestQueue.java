class Queue {
    int q[];
    int front, rear, size;

    Queue(int n) {
        size = n;
        q = new int[size];
        front = -1;
        rear = -1;
    }

    void insert(int val) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1)
                front = 0;
            q[++rear] = val;
        }
    }

    void delete() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Deleted element = " + q[front]);
            front++;
        }
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(q[i] + " ");
            }
            System.out.println();
        }
    }
}
class TestQueue {
    public static void main(String args[]) {
        Queue obj = new Queue(5);

        obj.insert(10);
        obj.insert(20);
        obj.insert(30);

        obj.display();

        obj.delete();

        obj.display();
    }
}