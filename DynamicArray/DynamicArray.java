package DynamicArray;

public class DynamicArray<T> {

    final static int INITIAL_CAPAZITY = 8;

    T[] data;
    int size;

    /**
     * Construct a new and empty DynamicArray.
     */
    public DynamicArray() {
        // Construct an array of suitable size and
        // reinterprete it as an array of generic type T
        data = (T[]) new Object[INITIAL_CAPAZITY];
        size = 0;
    }

    /**
     * Add an element to the back of the array.
     * 
     * @param element
     */
    public void add(T element) {
        throw new UnsupportedOperationException("The method add(e) has yet to be implemented!");
    }

    /**
     * Get the element at index idx.
     * 
     * @param idx
     */
    public T get(int idx) {
        throw new UnsupportedOperationException("The method get(idx) has yet to be implemented!");
    }

    /**
     * Remove the element at index idx. All further elements will be shifted left.
     * 
     * @param idx
     */
    public void remove(int idx) {
        throw new UnsupportedOperationException("The method remove(idx) has yet to be implemented!");
    }

    /**
     * Get the current number of stored elements.
     * 
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * Helper method to increase thecapacity of the underlying array.
     */
    protected void increaseCapacity() {
        throw new UnsupportedOperationException();
    }

    /**
     * Helper method to decrease thecapacity of the underlying array.
     */
    protected void decreaseCapacity() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < size - 1; ++i) {
            str.append(data[i]);
            str.append(", ");
        }
        str.append(data[size - 1]);
        str.append("]");
        return str.toString();
    }

}
