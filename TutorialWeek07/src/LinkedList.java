public class LinkedList<T extends Comparable<T>> implements Comparable<LinkedList<T>> {
    private T data;
    private LinkedList<T> nextNode;

    public LinkedList(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public LinkedList<T> getNextNode() {
        return nextNode;
    }

    public void add(T element) {
        LinkedList<T> newNode = new LinkedList<>(element);
        LinkedList<T> endNode = this;

        while (endNode.nextNode != null) {
            endNode = endNode.nextNode;
        }

        endNode.nextNode = newNode;
    }

    public void addAfter(T element, T after) {
        LinkedList<T> newNode = new LinkedList<>(element);
        LinkedList<T> afterNode = this;

        while (afterNode.nextNode != null) {
            if (afterNode.data.equals(after)) {
                newNode.nextNode = afterNode.nextNode;
                afterNode.nextNode = newNode;
                break;
            }

            afterNode = afterNode.nextNode;
        }
    }

    public void deleteAfter(T after) {
        LinkedList<T> currentNode = this;
        while (currentNode.nextNode != null) {
            if (currentNode.data.equals(after)) {
                currentNode.nextNode = currentNode.nextNode.nextNode;
                break;
            }

            currentNode = currentNode.nextNode;
        }
    }

    public void traverse() {
        LinkedList<T> next = this;
        System.out.println(next);

        while (next.nextNode != null) {
            next = next.nextNode;
            System.out.println(next);
        }
    }

    @Override
    public String toString() {
        return String.format("Node,%n%s", this.data);
    }

    @Override
    public int compareTo(LinkedList<T> other) {
        return this.data.compareTo(other.data);
    }
}
