import org.junit.jupiter.api.Test;
import uk.ac.rhul.Stack;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    /**
     * This test case checks if the constructor of the `Stack` class works properly.
     * It calls the `Stack` class constructor and asserts that the returned object is not null and is an instance of the `Stack` class.
     */
    @Test
    public void testingStackConstructor() {
        // Test 1
        // Initially we had not written a Stack class, so the test fails. To get this test to pass I just had to create a Stack class
        Stack stack = new Stack();
        assertNotNull(stack);
        assertTrue(stack instanceof Stack); // Potentially redundant, consider removing this test
    }

    /**
     * A test case for the `size()` method when the stack is empty.
     * This test case checks if the `size()` method of the `Stack` class returns the correct size when the stack is empty.
     * It creates an instance of the `Stack` class and calls the `size()` method on it. Since the stack is empty, the expected
     * size is 0. The test asserts that the actual size returned by the `size()` method is equal to the expected size.
     */
    @Test
    public void testingSizeOnEmptyStack() {
        // Test 2
        // Initially there is no size() method, so the test fails. To get this test to pass I had to add a size() method and I faked a result of 0
        Stack stack = new Stack();
        assertEquals(0, stack.size());
    }

    @Test
    public void testingPushingAnEntryToTheStack() {

    }
}
