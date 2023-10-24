import org.junit.jupiter.api.Test;
import uk.ac.rhul.Entry;
import uk.ac.rhul.Symbol;
import uk.ac.rhul.Type;
import uk.ac.rhul.exceptions.BadType;

import static org.junit.jupiter.api.Assertions.*;

public class EntryTest {

//    Commented out as this test now fails as I've developed the Entry class further
//    /**
//     * This test case checks constructor for the `Entry` class works, by creating an instance of `Entry` and ensuring it is not null.
//     * For this test case we are not passing any arguments into the constructor.
//     */
//    @Test
//    public void testingEmptyEntryConstructor() {
//        // Test 1
//        // Initially the test fails as we have not written an Entry class. To get this test to pass I had to create an Entry class
//        Entry entry = new Entry();
//        assertNotNull(entry);
//    }

    /**
     * Testing the constructors of the Entry class with arguments of type float or String.
     */
    @Test
    public void testingConstructorWithFloatOrString() {
        // Test 2
        // To get this test to pass I had to write constructor methods to take arguments of type float or String

        // Testing constructor with float
        float floatArg = 0.5f;
        Entry entry1 = new Entry(floatArg);
        assertNotNull(entry1);

        // Testing constructor with String
        String stringArg = "myString";
        Entry entry2 = new Entry(stringArg);
        assertNotNull(entry2);
    }

    /**
     * This test case checks constructor for the `Entry` class works when a Symbol is passed to the constructor
     */
    @Test
    public void testingConstructorWithSymbol() {
        // Test 3
        // To pass this test I had to write my `Symbol` class and then add a constructor to `Entry` that takes an instance of `Symbol` as an argument

        Symbol symbolArg = Symbol.LEFT_BRACKET;
        Entry entry3 = new Entry(symbolArg);
        assertNotNull(entry3);
    }

    /**
     * A test case for the `getType()` method, that asserts that the correct `Type` is returned when the `getType()` method is called
     * (depending on what value type was passed into the constructor)
     * E.g. Entry(1.0f).getType() should return Type.NUMBER
     */
    @Test
    public void testingGetTypeMethod() {
        // Test 4
        // Initially fails as no `Type` class has been written

        // To get this test to pass I had to:
            // 1) Write a Type class
            // 2) Add a getType() method to Entry
            // 3) Adjust my constructors to set the private attribute `type` accordingly

        // Testing Type.NUMBER
        Entry floatEntry = new Entry(1.0f);
        assertEquals(Type.NUMBER, floatEntry.getType());

        // Testing Type.STRING
        Entry stringEntry = new Entry("myString");
        assertEquals(Type.STRING, stringEntry.getType());

        // Testing Type.SYMBOL
        Entry symbolEntry = new Entry(Symbol.LEFT_BRACKET);
        assertEquals(Type.SYMBOL, symbolEntry.getType());
    }

    /**
     * A test case for the `getString()` method, that asserts that the correct string is returned when the `getString()` method is called.
     * This test assumes that getString() is being used properly
     * E.g. Entry("My string").getString() should return "My string"
     *
     * @throws BadType As we are not handling BadType exceptions here (this test case assumes getString() is being used properly)
     */
    @Test
    public void testingGetStringMethod() throws BadType {
        // Test 5
        // Initially fails as no getString() method has been written
        // To pass the test I had to:
            // 1) Write a getString() method to Entry
            // 2) Adjust my constructor to set the private attribute `str` when a string argument is passed

        Entry entry = new Entry("Test Driven Development");
        assertEquals("Test Driven Development", entry.getString());
    }

    /**
     * A test case that throws a BadType exception when getString() method is called on an Entry object that was not
     * constructed with a string argument.
     * E.g. Entry(1.0f).getString() should throw BadType exception
     */
    @Test
    public void testingGetStringMethodThrowsBadType() {
        // Test 6

        // Initially: test fails as we have not created a BadType exception or adjusted our getString method to throw it
        // To pass this test I had to:
            // 1) Create a custom exception: BadType which extends Exception
            // 2) Adjust the getString() method to throw BadType
            // 3) Adjust getString() to check type is Type.STRING before returning string value, else throw BadType with appropriate message

        // Asserting correct error is thrown when getString() is called on a float Entry
        Entry floatEntry = new Entry(1.0f);
        BadType thrown1 = assertThrowsExactly(BadType.class, () -> floatEntry.getString()); // TODO: Review slides to see if lectures uses method references instead of lambda functions e.g. floatEntry::getString instead of () -> floatEntry.getString() as we're currently getting a warning about this
        assertEquals("getString() called on wrong type. This Entry object is of type: NUMBER", thrown1.getMessage());

        // Asserting correct error is thrown when getString() is called on a Symbol Entry
        Entry symbolEntry = new Entry(Symbol.LEFT_BRACKET);
        BadType thrown2 = assertThrowsExactly(BadType.class, () -> symbolEntry.getString());
        assertEquals("getString() called on wrong type. This Entry object is of type: SYMBOL", thrown2.getMessage());

        // Asserting NO error is thrown when getString() is called on a string Entry
        Entry stringEntry = new Entry("myString");
        assertDoesNotThrow(() -> stringEntry.getString());
    }

    // TODO Repeat the last two tests for getSymbol() and getValue()

}
