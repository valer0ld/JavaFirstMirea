package ru.mirea.task23.ex2;

public class LinkedQueue implements Queue{

    QueueNode top;
    int size, counter;

    LinkedQueue(int size)
    {
        this.size = size;
        this.counter = 0;
        this.top = new QueueNode();
    }

    @Override
    public boolean isFull() {
        return counter >= size;
    }

    @Override
    public boolean isEmpty() {
        return counter == 0;
    }

    @Override
    public void add(int t) {
        if(isFull())
        {
            System.out.println("Очередь переполнена");
            System.exit(1);
        }
        if (this.top == null) this.top = new QueueNode();
        QueueNode t1 = this.top;
        if(!isEmpty())
        {
            while (t1.next != null) t1 = t1.next;
            t1.next = new QueueNode();
            t1 = t1.next;
        }
        counter++;
        t1.el = t;
    }

    @Override
    public int pop() {
        if (isEmpty())
        {
            System.out.println("Очередь пуста");
            System.exit(1);
        }
        int el = top.el;
        this.top = this.top.next;
        counter--;
        return el;
    }

    @Override
    public void printQ() {
        System.out.print("Queue: [");
        QueueNode t1 = this.top;
        while(t1 != null)
        {
            System.out.print(" " + t1.el);
            t1 = t1.next;
        }
        System.out.print(" ]\n");
    }

    @Override
    public void clear() {
        this.top = null;
        counter = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int element() {
        return this.top.el;
    }
}

