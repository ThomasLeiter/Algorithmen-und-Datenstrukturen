class Node<T> {
    protected T data;
    protected Node<T> next;

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    /**
     * Helper method to pretty-print our simple linked list
     * @param <T>
     * @param head
     */
    public static <T> void printList(Node<T> head) {
        Node<T> currentNode = head;
        System.out.print("[");
        while (null != currentNode) {
            // Print contained data!
            System.out.print(currentNode.data);
            currentNode = currentNode.next;
            if (null != currentNode) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        Node<String> einstein = new Node<>("Einstein", null);
        Node<String> bach = new Node<>("Bach", einstein);
        printList(bach);
    }

}