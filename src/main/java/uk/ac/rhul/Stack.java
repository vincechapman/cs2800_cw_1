package uk.ac.rhul;

import uk.ac.rhul.exceptions.EmptyStack;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Stack {

    private List<Entry> entries = new ArrayList<Entry>();
    private int size = 0;

    // Methods

    /**
     * Returns the size of the stack.
     *
     * @return the size of the stack
     */
    public int size() {
        return size;
    }

    /**
     * Pushes an entry onto the stack.
     *
     * @param entry the entry to be pushed onto the stack
     */
    public void push(Entry entry) {
        entries.add(entry);
        size++;
    }

    /**
     * Retrieves the top element of the stack. (But does not remove it)
     *
     * @return the top element of the stack
     * @throws EmptyStack if the stack is empty
     */
    public Entry top() throws EmptyStack {
        if (size == 0) {
            throw new EmptyStack("Cannot call top() on empty stack");
        } else {
            return entries.getLast();
        }
    }

    /**
     * Removes and returns the top element from the stack.
     *
     * @return the top element of the stack
     * @throws EmptyStack if the stack is empty
     */
    public Entry pop() throws EmptyStack {
        if (size == 0) {
            throw new EmptyStack("Cannot call pop() on empty stack");

        } else {
            Entry entry = entries.remove(size - 1);
            size--;
            return entry;

        }
    }
}
