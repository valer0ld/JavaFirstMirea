package ru.mirea.task23.ex1;

public class ArrayQueueModule {
    private int[] queue;
    private final int size;
    private int front, rear;

    private boolean inOneLap;

    ArrayQueueModule()
    {
        front = -1;
        rear = -1;
        size = 5;
        queue = new int[size];
        inOneLap = true;
    }

    public boolean isFull()
    {
        return (front == 0 && rear == size - 1) || ( rear == front && !inOneLap);
    }

    public boolean isEmpty()
    {
        return (rear == -1 && front == -1) || (front == rear && inOneLap);
    }

    public void add(int t)
    {
        if (rear == size - 1)
        {
            rear = -1;
            inOneLap = false;
        }
        if (isFull())
        {
            System.out.println("Очередь переполнена");
            System.exit(1);
        }
        rear++;
        queue[rear] = t;
    }

    public int pop()
    {
        if (isEmpty())
        {
            System.out.println("Очередь пуста");
            System.exit(1);
        }
        if (front == size - 1)
        {
            front = -1;
            inOneLap = true;
        }
        front++;
        return queue[front];
    }

    public void printQ()
    {
        System.out.print("Queue: [");
        int end = (!inOneLap) ? 4 : rear;
        for (int i = front+1; i <= end; i++)
        {
            System.out.print(" " + queue[i]);
        }
        if (!inOneLap)
            for (int i = 0; i <= rear; i++) System.out.print(" " + queue[i]);
        System.out.print(" ]\n");
    }

    public void clear()
    {
        front = -1;
        rear = -1;
        inOneLap = true;
    }

    public int size()
    {
        return (!inOneLap) ? 5 - front + rear : rear - front;
    }

    public int element()
    {
        return queue[front+1];
    }
}
