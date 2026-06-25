
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        // Arrange: Initialize test fixture before each test
        calculator = new Calculator();
        System.out.println("Setup: New Calculator instance created.");
    }

    @After
    public void tearDown() {
        // Clean up after each test if needed
        System.out.println("Teardown: Test completed.\n");
    }

    @Test
    public void testAdd() {
        // Arrange done in setUp()
        // Act
        calculator.add(5);
        // Assert
        assertEquals(5, calculator.getValue());
    }

    @Test
    public void testSubtractSuccess() {
        // Arrange
        calculator.add(10);
        // Act
        boolean result = calculator.subtract(4);
        // Assert
        assertTrue(result);
        assertEquals(6, calculator.getValue());
    }

    @Test
    public void testSubtractFailure() {
        // Arrange
        calculator.add(2);
        // Act
        boolean result = calculator.subtract(5);
        // Assert
        assertFalse(result);
        assertEquals(2, calculator.getValue());
    }
}
