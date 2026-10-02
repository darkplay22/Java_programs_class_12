class deQueue {
    int Qrr[];
    int lim;
    int front;
    int rear;

    // Constructor
    deQueue(int l) {
        lim = l;
        Qrr = new int[lim];
        front = -1;
        rear = -1;
    }

    // Add at FRONT
    void addFront(int v) {
        if ((front == 0 && rear == lim - 1) || (front == rear + 1)) {
            System.out.println("OVERFLOW FROM FRONT");
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = lim - 1;
        } else {
            front--;
        }

        Qrr[front] = v;
    }

    // Add at REAR
    void addRear(int v) {
        if ((front == 0 && rear == lim - 1) || (front == rear + 1)) {
            System.out.println("OVERFLOW FROM REAR");
            return;
        }

        if (rear == -1) {
            front = 0;
            rear = 0;
        } else if (rear == lim - 1) {
            rear = 0;
        } else {
            rear++;
        }

        Qrr[rear] = v;
    }

    // Remove from FRONT
    int popFront() {
        if (front == -1) {
            return -999;
        }

        int val = Qrr[front];

        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == lim - 1) {
            front = 0;
        } else {
            front++;
        }

        return val;
    }

    // Remove from REAR
    int popRear() {
        if (rear == -1) {
            return -999;
        }

        int val = Qrr[rear];

        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = lim - 1;
        } else {
            rear--;
        }

        return val;
    }

    // Display deque
    void show() {
        if (front == -1) {
            System.out.println("DEQUE IS EMPTY");
            return;
        }

        System.out.print("Deque elements: ");
        int i = front;

        while (true) {
            System.out.print(Qrr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % lim;
        }
        System.out.println();
    }
}

// Main class
public class  dequeue
{
    public static void main(String[] args) {
        deQueue dq = new deQueue(5);

        dq.addRear(10);
        dq.addRear(20);
        dq.addRear(30);
        dq.show();

        dq.addFront(5);
        dq.show();

        System.out.println("Removed from front: " + dq.popFront());
        dq.show();

        System.out.println("Removed from rear: " + dq.popRear());
        dq.show();

        dq.addFront(1);
        dq.addRear(40);
        dq.addRear(50);
        dq.show();
    }
}
