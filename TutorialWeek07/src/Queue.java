import java.util.ArrayList;

public class Queue<T> {
    private final int maxSize;
    private final ArrayList<T> queue;

    public Queue(int size) {
        this.maxSize = size;
        this.queue = new ArrayList<>(this.maxSize);
    }

    public void enQueue(T element) {
        if (this.queue.size() >= this.maxSize) {
            return;
        }

        this.queue.add(element);
    }

    public T deQueue() {
        if (this.queue.isEmpty()) {
            return null;
        }

        return this.queue.remove(0);
    }

    @Override
    public String toString() {
        return this.queue.toString();
    }
}
