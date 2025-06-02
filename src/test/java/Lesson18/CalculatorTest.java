package Lesson18;

import org.testng.annotations.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Calculator initialized.");
    }

    @AfterClass
    public void tearDown() {
        calculator = null;
        System.out.println("Calculator cleaned up.");
    }

    @Test(priority = 1, description = "Test addition")
    public void testAddition() {
        int result = calculator.add(5, 3);
        System.out.println("Addition result: " + result);
        assert result == 8;
    }

    @Test(priority = 2, description = "Test subtraction")
    public void testSubtraction() {
        int result = calculator.subtract(10, 4);
        System.out.println("Subtraction result: " + result);
        assert result == 6;
    }

    @Test(priority = 3, description = "Test multiplication")
    public void testMultiplication() {
        int result = calculator.multiply(6, 7);
        System.out.println("Multiplication result: " + result);
        assert result == 42;
    }

    @Test(priority = 4, description = "Test division")
    public void testDivision() {
        int result = calculator.divide(20, 4);
        System.out.println("Division result: " + result);
        assert result == 5;
    }

    @Test(priority = 5, description = "Test division by zero", expectedExceptions = ArithmeticException.class)
    public void testDivisionByZero() {
        calculator.divide(10, 0);
    }
}
