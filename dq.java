class Deque
{
    int dq[];
    int front, rear, size;

    Deque(int n)
    {
        size = n;
        dq = new int[size];
        front = -1;
        rear = -1;
    }

    void insertRear(int v)
    {
        if(rear == size - 1)
            System.out.println("Deque Overflow");
        else
        {
            if(front == -1)
                front = 0;
            dq[++rear] = v;
        }
    }                                                                                                                                                                            

    void insertFront(int v)
    {
        if(front <= 0)
            System.out.println("Insertion at front not possible");
        else
            dq[--front] = v;
    }

    int deleteFront()
    {
        if(front == -1 || front > rear)
            return -9999;
        return dq[front++];
    }

    int deleteRear()
    {
        if(front == -1 || front > rear)
            return -9999;
        return dq[rear--];
    }

    void display()
    {
        if(front == -1 || front > rear)
            System.out.println("Deque Empty");
        else
        {
            for(int i = front; i <= rear; i++)
                System.out.print(dq[i] + " ");
            System.out.println();
        }
    }
}
class TestDeque
{
    public static void main(String args[])
    {
        Deque d = new Deque(5);

        d.insertRear(10);
        d.insertRear(20);
        d.insertRear(30);

        d.display();

        System.out.println("Deleted Front = " + d.deleteFront());
        System.out.println("Deleted Rear = " + d.deleteRear());

        d.display();
    }
}