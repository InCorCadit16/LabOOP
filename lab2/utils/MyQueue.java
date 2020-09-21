package lab2.utils;

public class MyQueue<T>   {
    private Node head;
    private int length;
    final boolean fixedSize;
    
    public MyQueue() {
        fixedSize = false;
    }

    public MyQueue(int maxLength) {
        length = maxLength;
        fixedSize = true;
    }

    public void push(T value) {
        if (fixedSize && size() >= length)
            throw new OutOfMemoryError("Exeeded maximal length of MyQueue: " + length);

        if (head == null) {
            head = new Node(value, null);
        } else {
            var newHead = new Node(value, head);
            head = newHead;
        }
    }

    public T pop() {
        if (head == null)
            throw new NullPointerException("MyQueue is empty");

        Node preLast = head;
        while (preLast.next != null && preLast.next.next != null) preLast = preLast.next; 
        
        if (preLast.next == null) {
            head = null;
            return preLast.value;
        } else {
            T value = preLast.next.value;
            preLast.next = null;
            return value;
        }
    }

    public int size() {
        if (head == null)
            return 0;

        int size = 1;
        Node last = head;
        while ((last = last.next) != null) size++;
        return size;
    }

    public boolean isEmpty() { return size() == 0; }

    public QueueFull isFull() {
        if (!fixedSize)
            return QueueFull.NeverFull;

        return size() == length ? QueueFull.Full : QueueFull.NotFull;

    }

    private class Node {
        T value;
        Node next;

        Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
