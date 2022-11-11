package SingleLinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class SingleLinkedListTest {

    @Test
    public void testAdd() {
        try {
            SingleLinkedList<Integer> list = new SingleLinkedList<>();
            list.add(3);
            assertEquals("Adding 3 to empty list failed.", "[3]", list.toString());
            list.add(1);
            assertEquals("Adding 1 to list [3] failed.", "[3, 1]", list.toString());
            list.add(4);
            assertEquals("Adding 4 to list [3, 1] failed.", "[3, 1, 4]", list.toString());
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void testConcat() {
        try {
            SingleLinkedList<Integer> list = new SingleLinkedList<>();
            SingleLinkedList<Integer> other = new SingleLinkedList<>();
            list.add(3);
            list.add(1);
            list.add(4);
            other.add(2);
            other.add(5);
            other.add(6);
            list.concat(other);
            assertEquals("Concatenating lists [3, 1, 4] and [2, 5, 6] failed.", "[3, 1, 4, 2, 5, 6]", list.toString());
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void testGet() {
        try {
            SingleLinkedList<Integer> list = new SingleLinkedList<>();
            list.add(3);
            list.add(1);
            list.add(4);
            list.add(2);
            int element = list.get(2);
            assertEquals("Getting element at index 2 failed.", 4, element);
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void testInsert() {
        try {
            SingleLinkedList<Integer> list = new SingleLinkedList<>();
            list.add(3);
            list.add(1);
            list.add(4);
            list.add(2);
            list.insert(5, 1);
            assertEquals("Inserting element 5 at index 1 failed.", "[3, 5, 1, 4, 2]", list.toString());
            list.insert(6, 4);
            assertEquals("Inserting element 6 at index 4 failed.", "[3, 5, 1, 4, 6, 2]", list.toString());
            list.insert(7, 0);
            assertEquals("Inserting element 7 at index 0 failed.", "[7, 3, 5, 1, 4, 6, 2]", list.toString());
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void testRemove() {
        try {
            SingleLinkedList<Integer> list = new SingleLinkedList<>();
            list.add(3);
            list.add(1);
            list.add(4);
            list.add(2);
            list.remove(1);
            assertEquals("Removing element at index 1 failed.", "[3, 4, 2]", list.toString());
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
            fail();
        }
    }
}
