package DynamicArray;

public class DynamicArray<T> {
    
    final static int INITIAL_CAPAZITY = 8;

    T[] data;
    int size;

    public DynamicArray(){
        data = (T[]) new Object[INITIAL_CAPAZITY];
        size = 0;
    }

    public void add(T element){
        throw new UnsupportedOperationException("The method add(e) has yet to be implemented!");
    }

    public T get(int idx){
        throw new UnsupportedOperationException("The method get(idx) has yet to be implemented!");
    }

    public void remove(int idx){
        throw new UnsupportedOperationException("The method remove(idx) has yet to be implemented!");
    }

    public int size(){
        return size;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < size - 1; ++i){
            str.append(data[i]);
            str.append(", ");
        }
        str.append(data[size-1]);
        str.append("]");
        return str.toString();
    }

}
