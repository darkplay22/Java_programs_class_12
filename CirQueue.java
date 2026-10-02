public class CirQueue
{
    int cq[];
    int cap;
    int front, rear;

    CirQueue(int n)
    {
        cap = n;
        cq = new int[cap];
        front = 0;
        rear = 0;
    }

    void push(int v)
    {
        if((rear + 1) % cap != front)
        {
            rear = (rear + 1) % cap;
            cq[rear] = v;
        }
        else
            System.out.println("QUEUE IS FULL");
    }

    int pop()
    {
        if(front != rear)
        {
            front = (front + 1) % cap;
            return cq[front];
        }
        else
        {
            System.out.println("QUEUE IS EMPTY");
            return -9999;
        }
    }

    void display()
    {
        if(front == rear)
        {
            System.out.println("QUEUE IS EMPTY");
            return;
        }

        int i = (front + 1) % cap;

        while(i != (rear + 1) % cap)
        {
            System.out.print(cq[i] + " ");
            i = (i + 1) % cap;
        }
        System.out.println();
    }
} 
    
class Test
{
    public static void main(String args[])
    {
        CirQueue q = new CirQueue(5);

        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);

        q.display();

        System.out.println("Deleted = " + q.pop());
        System.out.println("Deleted = " + q.pop());

        q.display();

        q.push(50);
        q.push(60);

        q.display();
    }
}
