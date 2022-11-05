package SingleLinkedList;

public class SingleLinkedList<T> {

    class ListNode {
        T data;
        ListNode next;

        ListNode(T data, ListNode next) {
            this.data = data;
            this.next = next;
        }
    }

    ListNode head;
    ListNode tail;
    int size;

    /**
     * Construct a new empty list.
     */
    public SingleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Add an element to the back of the list
     * e.g. [3,1,4,2,6].add(5) -> [3,1,4,2,6,5]
     * 
     * @param element
     */
    public void add(T element) {
        // TODO
        throw new UnsupportedOperationException("The method 'add(ele)' has yet to be implemented!");
    }

    /**
     * Insert an element at (i.e. before) index idx.
     * e.g. [3,1,4,2,6].insert(5,1) -> [3,5,1,4,2,6]
     * 
     * @param element
     * @param idx
     */
    public void insert(T element, int idx) {
        // TODO
        throw new UnsupportedOperationException("The method 'insert(ele,idx)' has yet to be implemented!");
    }

    /**
     * Remove the element at index idx.
     * e.g. [3,1,4,2,6].remove(1) -> [3,4,2,6]
     * 
     * @param idx
     */
    public void remove(int idx) {
        // TODO
        throw new UnsupportedOperationException("The method 'remove(idx)' has yet to be implemented!");
    }

    /**
     * Concatenate another list to the end of this list.
     * e.g. [3,1,4].concat([2,4,5]) -> [3,1,4,2,4,5]
     * 
     * @param other
     */
    public void concat(SingleLinkedList<T> other) {
        // TODO
        throw new UnsupportedOperationException("The method 'concat(other)' has yet to be implemented!");
    }

    /**
     * Get the element at index idx.
     * e.g. [3,1,4,2,6].get(2) -> 4
     * 
     * @param idx
     * @return
     */
    public T get(int idx) {
        // TODO
        throw new UnsupportedOperationException("The method 'concat(other)' has yet to be implemented!");
    }

    /**
     * Get the size of the list.
     * e.g. [3,1,4,2,6].size() -> 5
     * 
     * @return
     */
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        // We use StringBuilder since String
        // concatenation is pretty inefficient
        // due to repeated copying.
        StringBuilder str = new StringBuilder();
        str.append("[");
        ListNode node = head;
        while (node != null) {
            str.append(node.data);
            node = node.next;
            if (node != null) {
                str.append(", ");
            }
        }
        str.append("]");
        return str.toString();
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof SingleLinkedList)) {
            return false;
        }
        return this.toString().equals(other.toString());
    }

}
