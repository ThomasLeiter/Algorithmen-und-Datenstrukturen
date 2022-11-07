package DynamicArray;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class DynamicArrayTest {
    @Test
    public void testAdd() {
        try {
            DynamicArray<Integer> array = new DynamicArray<>();
            array.add(3);
            assertEquals("Adding element 3 to empty list failed.", "[3]", array.toString());
            array.add(1);
            assertEquals("Adding element 1 to list [3] failed.", "[3, 1]", array.toString());
            array.add(4);
            assertEquals("Adding element 4 to list [3, 1] failed.", "[3, 1, 4]", array.toString());
            for (Integer i = 0; i < 100; ++i) {
                array.add(i);
            }
            assertEquals("Adding 100 more elements failed.", 103, array.size());
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void testGet() {
        try {
            DynamicArray<Integer> array = new DynamicArray<>();
            for (Integer i = 100; i < 200; ++i) {
                array.add(i);
            }
            int twentieth = array.get(19);
            assertEquals("Getting the 20th element failed.", 119, twentieth);
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void testRemove() {
        try {
            DynamicArray<Integer> array = new DynamicArray<>();
            for (Integer i = 100; i < 200; ++i) {
                array.add(i);
            }
            array.remove(19);
            assertEquals("Removing the 20th element failed.", 99, array.size());
            int thirtieth = array.get(29);
            assertEquals("Removing the 20th element failed.", 130, thirtieth);
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
            fail();
        }
    }
}
