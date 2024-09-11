class MyCircularQueue {
    private int[] data;
    private int head;
    private int tail;
    private int size;
    private int capacity;

    public MyCircularQueue(int k) {
        data = new int[k];  // Fixed-size array
        head = -1;          // -1 means the queue is empty
        tail = -1;          // -1 means the queue is empty
        size = 0;           // Track the current number of elements
        capacity = k;       // Max capacity of the queue

    }
    
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;  // Queue is full, cannot add more elements
        }
        if (isEmpty()) {
            head = 0;  // If the queue is empty, set head to 0
        }
        tail = (tail + 1) % capacity;  // Move tail to the next position circularly
        data[tail] = value;            // Insert the value at the tail
        size++;                        // Increment the size of the queue
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) {
            return false;  // Queue is empty, cannot remove elements
        }if (head == tail) {
            // This means the queue has only one element
            head = -1;
            tail = -1;
        } else {
            head = (head + 1) % capacity;  // Move head to the next position circularly
        }
        size--;  // Decrement the size of the queue
        return true;
    }
    
    public int Front() {
        if (isEmpty()) {
            return -1;  // Queue is empty
        }
        return data[head];
    }
    
    public int Rear() {
        if (isEmpty()) {
            return -1;  // Queue is empty
        }
        return data[tail];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */