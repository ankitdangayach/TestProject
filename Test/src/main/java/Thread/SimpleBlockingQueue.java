package Thread;

class SimpleBlockingQueue<T> {
    private final Object[] array;
    private int head;
    private int tail;
    private int count;

    public SimpleBlockingQueue(int capacity) {
        array = new Object[capacity];
        head = 0;
        tail = 0;
        count = 0;
    }

    public synchronized void put(T item) throws InterruptedException {
        while (count == array.length) {
            wait(); // Wait until there's space in the queue
        }
        array[tail] = item;
        tail = (tail + 1) % array.length;
        count++;
        notifyAll(); // Notify waiting threads that an item has been added
    }

    @SuppressWarnings("unchecked")
    public synchronized T take() throws InterruptedException {
        while (count == 0) {
            wait(); // Wait until there's an item to take
        }
        T item = (T) array[head];
        array[head] = null; // Clear the reference
        head = (head + 1) % array.length;
        count--;
        notifyAll(); // Notify waiting threads that an item has been removed
        return item;
    }

    public synchronized int size() {
        return count;
    }
}

